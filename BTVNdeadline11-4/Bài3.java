package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Bài3 {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfLay;
	private JTextField tfXuat;
	private JLabel lblDen;
	private JTextField tfDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài3 window = new Bài3();
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
	public Bài3() {
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
		
		JLabel lblNhap = new JLabel("Nh\u1EADp chu\u1ED7i:");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap.setBounds(35, 53, 86, 29);
		frame.getContentPane().add(lblNhap);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(131, 53, 257, 29);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		JLabel lblVitri = new JLabel("L\u1EA5y t\u1EEB v\u1ECB tr\u00ED:");
		lblVitri.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVitri.setBounds(35, 93, 86, 19);
		frame.getContentPane().add(lblVitri);
		
		tfLay = new JTextField();
		tfLay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfLay.setBounds(131, 93, 78, 29);
		frame.getContentPane().add(tfLay);
		tfLay.setColumns(10);
		
		JButton btnAn = new JButton("Th\u1EF1c hi\u1EC7n");
		btnAn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String chuoiCha=tfNhap.getText();
				String lay=tfLay.getText();
				String den=tfDen.getText();
				int m=Integer.parseInt(lay);
				int n=Integer.parseInt(den);
				String chuoiCon=chuoiCha.substring(m,n);
				tfXuat.setText(chuoiCon);
			}		
		});
		btnAn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAn.setBounds(172, 173, 146, 37);
		frame.getContentPane().add(btnAn);
		
		JLabel lblXuat = new JLabel("K\u1EBFt qu\u1EA3");
		lblXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuat.setBounds(35, 128, 86, 29);
		frame.getContentPane().add(lblXuat);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(131, 133, 257, 29);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		lblDen = new JLabel("\u0110\u1EBFn v\u1ECB tr\u00ED:");
		lblDen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDen.setBounds(232, 93, 86, 29);
		frame.getContentPane().add(lblDen);
		
		tfDen = new JTextField();
		tfDen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfDen.setBounds(310, 93, 78, 29);
		frame.getContentPane().add(tfDen);
		tfDen.setColumns(10);
	}
}
