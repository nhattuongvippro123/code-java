package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class mang4 {

	private JFrame frame;
	private JTextField tfNhap;
	private JTextField tfXuat;
	private JButton btnTim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mang4 window = new mang4();
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
	public mang4() {
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
		
		JLabel lblNhap = new JLabel("Nh\u1EADp m\u1EA3ng:");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap.setBounds(10, 58, 102, 25);
		frame.getContentPane().add(lblNhap);
		
		JLabel lblXuat = new JLabel("K\u1EBFt qu\u1EA3");
		lblXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuat.setBounds(10, 108, 73, 30);
		frame.getContentPane().add(lblXuat);
		
		tfNhap = new JTextField();
		tfNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap.setBounds(111, 56, 287, 30);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(111, 109, 287, 30);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		btnTim = new JButton("T\u1ED5ng");
		btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n=tfNhap.getText();
				String[] mangChuoi=n.split(",");
				Integer[] mangInt= new Integer[mangChuoi.length];
				for(int i=0;i<mangChuoi.length;i++) {
					mangInt[i]=Integer.parseInt(mangChuoi[i]);
				}
				int s=0;
				for(int i=0;i<mangInt.length;i++) {
							s=s+mangInt[i];
				}
				String a=Integer.toString(s);
			    tfXuat.setText(a);
		  } 
	});		
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTim.setBounds(169, 164, 112, 30);
		frame.getContentPane().add(btnTim);
		
	}

}
