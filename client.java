package baitap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.net.Socket;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.awt.event.ActionEvent;

public class client extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtKQ;
	private Socket socketclient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client frame = new client();
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
	public client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Firstnumber = new JLabel("First number :");
		Firstnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Firstnumber.setForeground(Color.BLACK);
		Firstnumber.setBounds(12, 116, 127, 69);
		contentPane.add(Firstnumber);
		
		JLabel lblSecondNumber = new JLabel("Second number :");
		lblSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSecondNumber.setForeground(Color.BLACK);
		lblSecondNumber.setBounds(12, 219, 127, 69);
		contentPane.add(lblSecondNumber);
		
		JLabel lblResultFromServer = new JLabel("Result from server :");
		lblResultFromServer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultFromServer.setForeground(Color.BLACK);
		lblResultFromServer.setBounds(12, 327, 148, 69);
		contentPane.add(lblResultFromServer);
		
		txt1 = new JTextField();
		txt1.setBounds(172, 123, 352, 56);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(172, 226, 352, 56);
		contentPane.add(txt2);
		
		txtKQ = new JTextField();
		txtKQ.setColumns(10);
		txtKQ.setBounds(172, 334, 352, 56);
		contentPane.add(txtKQ);
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

				}
				catch (Exception e) {
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(592, 117, 97, 69);
		contentPane.add(btnNewButton);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socketClient = new Socket("localhost",5555);
					String a= txt1.getText();
					String b= txt2.getText();
					DataOutputStream outputClient = new DataOutputStream(socketClient.getOutputStream());
					outputClient.writeBytes(a+"\n");
					outputClient.writeBytes(b+"\n");
					DataInputStream inputClient = new DataInputStream(socketClient.getInputStream());
					String tong = inputClient.readLine();
					txtKQ.setText(tong);
					inputClient.close();
					outputClient.close();
					socketClient.close();
				} catch (Exception e1) {}
			}
		});
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSend.setBounds(592, 220, 97, 69);
		contentPane.add(btnSend);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				client.close();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(592, 328, 97, 69);
		contentPane.add(btnExit);
		}

	protected static void close() {
		System.exit(0);
	}
}
