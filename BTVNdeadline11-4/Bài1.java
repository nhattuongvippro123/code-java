package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bài1 {

	private JFrame frame;
	private JTextField tfnhap;
	private JTextField tfxuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài1 window = new Bài1();
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
	public Bài1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfnhap = new JTextField();
		tfnhap.setBounds(118, 46, 150, 35);
		frame.getContentPane().add(tfnhap);
		tfnhap.setColumns(10);
		
		tfxuat = new JTextField();
		tfxuat.setBounds(118, 134, 150, 35);
		frame.getContentPane().add(tfxuat);
		tfxuat.setColumns(10);
		
		JButton btnm = new JButton("\u0110\u1EBFm");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String nhap =tfnhap.getText();
			int dem=0;
			for (int i=0;i<=nhap.length();i++)
			{
				dem=i;
			}
			String a =Integer.toString(dem);
			tfxuat.setText(a);
			tfnhap.setText(""); 
			}
		});
		btnm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnm.setBounds(152, 96, 97, 25);
		frame.getContentPane().add(btnm);
		
		JLabel lblNhpChui = new JLabel("Nh\u1EADp Chu\u1ED7i : ");
		lblNhpChui.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNhpChui.setBounds(12, 56, 104, 16);
		frame.getContentPane().add(lblNhpChui);
		frame.setTitle("Bài 1");
	}
}
