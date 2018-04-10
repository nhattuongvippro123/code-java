package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Bài9 {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfThay;
	private JTextField tfThe;
	private JTextField tfXuat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài9 window = new Bài9();
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
	public Bài9() {
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
		
		JLabel lblNhap = new JLabel("Nh\u1EADp Chu\u1ED7i:");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhap.setBounds(0, 35, 92, 14);
		frame.getContentPane().add(lblNhap);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNhap.setBounds(164, 29, 260, 28);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		JLabel lbl1 = new JLabel("Nh\u1EADp chu\u1ED7i c\u1EA7n thay:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl1.setBounds(0, 75, 147, 28);
		frame.getContentPane().add(lbl1);
		
		tfThay = new JTextField();
		tfThay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfThay.setBounds(164, 77, 260, 26);
		frame.getContentPane().add(tfThay);
		tfThay.setColumns(10);
		
		JLabel lbl2 = new JLabel("Nh\u1EADp chu\u1ED7i mu\u1ED1n thay:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2.setBounds(0, 130, 147, 20);
		frame.getContentPane().add(lbl2);
		
		tfThe = new JTextField();
		tfThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfThe.setBounds(164, 127, 261, 28);
		frame.getContentPane().add(tfThe);
		tfThe.setColumns(10);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfXuat.setBounds(164, 172, 260, 28);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		JLabel lblKQ = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKQ.setBounds(0, 185, 118, 15);
		frame.getContentPane().add(lblKQ);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nhap=tfNhap.getText();
				String lay=tfThay.getText();
				String thay =tfThe.getText();
				String ketqua=nhap.replaceAll(lay, thay);
				tfXuat.setText(ketqua);
			}
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClick.setBounds(164, 211, 118, 28);
		frame.getContentPane().add(btnClick);
	}

}
