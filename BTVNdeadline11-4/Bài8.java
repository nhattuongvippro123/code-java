package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Bài8 {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfXuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài8 window = new Bài8();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bài8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhap = new JLabel("Nh\u1EADp chu\u1ED7i");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap.setBounds(10, 91, 98, 30);
		frame.getContentPane().add(lblNhap);
		
		JLabel lblKQ = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKQ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKQ.setBounds(10, 132, 108, 30);
		frame.getContentPane().add(lblKQ);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(88, 96, 208, 25);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(88, 135, 208, 25);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		JButton btnChuyen = new JButton("Ki\u1EC3m tra");
		btnChuyen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n=tfNhap.getText();
				String a=n.trim();
				tfXuat.setText(a);
			}
			
		});
		
		btnChuyen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChuyen.setBounds(306, 106, 118, 30);
		frame.getContentPane().add(btnChuyen);
		
	}

}

