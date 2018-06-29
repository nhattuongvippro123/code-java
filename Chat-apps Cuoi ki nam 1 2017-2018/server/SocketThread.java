package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;


public class SocketThread implements Runnable{ 
    
    Socket socket;
    MainForm main;
    DataInputStream dis;
    StringTokenizer st;
    String client;
    
    
    public SocketThread(Socket socket, MainForm main){
        this.main = main;
        this.socket = socket;
        
        try {
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            main.appendMessage("[SocketThreadIOException]: "+ e.getMessage());
        }
    }
    
    
    @Override
    public void run() {
        try {    
            while(true){
                String data = dis.readUTF();
                st = new StringTokenizer(data);
                String CMD = st.nextToken();
                switch(CMD){
                    case "CMD_JOIN":
                        String clientUsername = st.nextToken();
                        client = clientUsername;
                        main.setClientList(clientUsername);
                        main.setSocketList(socket); 
                        main.appendMessage("[Client]: "+ clientUsername +" joins the chatroom.!");
                        break;
                        
                    case "CMD_CHATALL":
                        String chatall_from = st.nextToken();
                        String chatall_msg = "";
                        while(st.hasMoreTokens()){
                            chatall_msg = chatall_msg +" "+st.nextToken();
                        }
                        String chatall_content = chatall_from +" "+ chatall_msg;
                        for(int x=0; x < main.clientList.size(); x++){
                            if(!main.clientList.elementAt(x).equals(chatall_from)){
                                try {
                                    Socket tsoc2 = (Socket) main.socketList.elementAt(x); 
                                    DataOutputStream dos2 = new DataOutputStream(tsoc2.getOutputStream());
                                    dos2.writeUTF("CMD_MESSAGE "+ chatall_content);
                                } catch (IOException e) {
                                    main.appendMessage("[CMD_CHATALL]: "+ e.getMessage());
                                }
                            }
                        }
                        main.appendMessage("[CMD_CHATALL]: "+ chatall_content);
                        break;
                    default: 
                        main.appendMessage("[CMDException]: Unknown Command "+ CMD);
                    break;
                }
            }
        } catch (IOException e) {
            main.appendMessage("[SocketThread]: Client connection closed..!");
        }
    }
    
}