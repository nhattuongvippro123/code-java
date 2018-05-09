package baitap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class server extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					server frame = new server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ServerSocket server = new ServerSocket(5555);
					Socket socketServer = server.accept();
					DataInputStream inputServer = new DataInputStream(socketServer.getInputStream());
					String so1= inputServer.readLine();
					String so2 = inputServer.readLine();
					int a=Integer.parseInt(so1);
					int b=Integer.parseInt(so2);
					int tong = a+b;
					DataOutputStream outputServer = new DataOutputStream(socketServer.getOutputStream());
					outputServer.writeBytes(String.valueOf(tong));
					inputServer.close();
					outputServer.close();
					server.close();
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(115, 98, 186, 74);
		contentPane.add(btnNewButton);
		
	}

}
