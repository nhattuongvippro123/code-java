package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class mang1 {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfTim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mang1 window = new mang1();
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
	public mang1() {
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
		
		JLabel lblNhap = new JLabel("Nh\u1EADp m\u1EA3ng");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap.setBounds(10, 58, 96, 29);
		frame.getContentPane().add(lblNhap);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(105, 60, 308, 29);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		JLabel lblIn = new JLabel("");
		lblIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIn.setBounds(117, 140, 123, 29);
		frame.getContentPane().add(lblIn);
		
		JButton btnKT = new JButton("Ki\u1EC3m tra");
		btnKT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String nhap=tfNhap.getText();
				String[] mang=nhap.split(",");
				Integer[] mangInt=new Integer[mang.length];
				String m=tfTim.getText();
				int tim=Integer.parseInt(m);
				for(int i=0;i<mangInt.length;i++) {
					mangInt[i]=Integer.parseInt(mang[i]);
				}
				for(int i=0;i<mangInt.length;i++) {
				 if(tim==mangInt[i]) {
						lblIn.setText("True");
						break;
					   }
					   else {
						lblIn.setText("False");
				}
				}
			}			
		});
		btnKT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKT.setBounds(250, 140, 123, 29);
		frame.getContentPane().add(btnKT);
		
		JLabel lblTim = new JLabel("Nh\u1EADp gi\u00E1 tr\u1ECB");
		lblTim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTim.setBounds(10, 98, 96, 29);
		frame.getContentPane().add(lblTim);
		
		tfTim = new JTextField();
		tfTim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTim.setBounds(105, 98, 308, 29);
		frame.getContentPane().add(tfTim);
		tfTim.setColumns(10);
	}

}
