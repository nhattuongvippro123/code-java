package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class mang2 {

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
					mang2 window = new mang2();
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
	public mang2() {
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
		lblNhap.setBounds(10, 58, 87, 25);
		frame.getContentPane().add(lblNhap);
		
		JLabel lblXuat = new JLabel("K\u1EBFt qu\u1EA3");
		lblXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuat.setBounds(10, 103, 73, 30);
		frame.getContentPane().add(lblXuat);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(93, 56, 287, 30);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(93, 104, 287, 30);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		JButton btnMin = new JButton("S\u1ED1 nh\u1ECF nh\u1EA5t");
		btnMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n=tfNhap.getText();
				String[] mangChuoi=n.split(",");
				Integer[] mangInt= new Integer[mangChuoi.length];
				for(int i=0;i<mangChuoi.length;i++) {
					mangInt[i]=Integer.parseInt(mangChuoi[i]);
				}
				int min=mangInt[0];
				for(int i=0;i<mangInt.length;i++) {
						if(min>mangInt[i]) {
							min=mangInt[i];
						}
					}
				String kq=Integer.toString(min);
				tfXuat.setText(kq);
				}
		});
		btnMin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMin.setBounds(54, 161, 165, 30);
		frame.getContentPane().add(btnMin);
		
		JButton btnMax = new JButton("S\u1ED1 l\u1EDBn nh\u1EA5t");
		btnMax.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n=tfNhap.getText();
				String[] mangChuoi=n.split(",");
				Integer[] mangInt= new Integer[mangChuoi.length];
				for(int i=0;i<mangChuoi.length;i++) {
					mangInt[i]=Integer.parseInt(mangChuoi[i]);
				}
				int max=mangInt[0];
				for(int i=0;i<mangInt.length;i++) {
						if(max<mangInt[i]) {
							max=mangInt[i];
						}
					}
				String kq=Integer.toString(max);
				tfXuat.setText(kq);
				}
		});
		btnMax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMax.setBounds(246, 161, 165, 30);
		frame.getContentPane().add(btnMax);
	}

}

