package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Bài2 {

	private JFrame frame;
	private JTextField tfNhap1;
	private JTextField tfNhap2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài2 window = new Bài2();
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
	public Bài2() {
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
		
		JLabel lblNhap1 = new JLabel("Nh\u1EADp chu\u1ED7i:");
		lblNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap1.setBounds(22, 46, 87, 19);
		frame.getContentPane().add(lblNhap1);
		
		tfNhap1 = new JTextField();
		tfNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap1.setBounds(119, 42, 290, 30);
		frame.getContentPane().add(tfNhap1);
		tfNhap1.setColumns(10);
		
		JLabel lblNhap2 = new JLabel("Nh\u1EADp chu\u1ED7i:");
		lblNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap2.setBounds(22, 99, 87, 19);
		frame.getContentPane().add(lblNhap2);
		
		tfNhap2 = new JTextField();
		tfNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap2.setBounds(119, 93, 290, 30);
		frame.getContentPane().add(tfNhap2);
		tfNhap2.setColumns(10);
		
		JLabel lblXet = new JLabel("");
		lblXet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXet.setBounds(129, 134, 87, 30);
		frame.getContentPane().add(lblXet);
		
		JButton btnClick = new JButton("Ki\u1EC3m tra");
		btnClick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nhap1=tfNhap1.getText();
				String nhap2=tfNhap2.getText();
				
			    lblXet.setText(""+nhap1.contains(nhap2));
			}			
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClick.setBounds(268, 134, 111, 30);
		frame.getContentPane().add(btnClick);
		frame.setTitle("Bài 2");
	}
}
