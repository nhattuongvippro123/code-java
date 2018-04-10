package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class mang3 {

	private JFrame frame;
	private JTextField tfNhap1;
	private JTextField tfXuat;
	private JButton btnTim;
	private JLabel lblNhap2;
	private JTextField tfNhap2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mang3 window = new mang3();
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
	public mang3() {
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
		
		JLabel lblNhap1 = new JLabel("Nh\u1EADp m\u1EA3ng 1:");
		lblNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap1.setBounds(10, 38, 102, 25);
		frame.getContentPane().add(lblNhap1);
		
		JLabel lblXuat = new JLabel("K\u1EBFt qu\u1EA3");
		lblXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuat.setBounds(10, 122, 73, 30);
		frame.getContentPane().add(lblXuat);
		
		tfNhap1 = new JTextField();
		tfNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap1.setBounds(111, 36, 287, 30);
		frame.getContentPane().add(tfNhap1);
		tfNhap1.setColumns(10);
		
		tfXuat = new JTextField();
		tfXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat.setBounds(111, 123, 287, 30);
		frame.getContentPane().add(tfXuat);
		tfXuat.setColumns(10);
		
		btnTim = new JButton("T\u00ECm");
		btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n=tfNhap1.getText();
				String m=tfNhap2.getText();
				String[] mangChuoi1=n.split(",");
				String[] mangChuoi2=m.split(",");
				Integer[] mangInt1= new Integer[mangChuoi1.length];
				Integer[] mangInt2= new Integer[mangChuoi2.length];
				for(int i=0;i<mangChuoi1.length;i++) {
					mangInt1[i]=Integer.parseInt(mangChuoi1[i]);
				}
				for(int i=0;i<mangChuoi2.length;i++) {
					mangInt2[i]=Integer.parseInt(mangChuoi2[i]);
				}
				int a=0;
				for(int i=0;i<mangInt1.length;i++) {
					for(int j=0;j<mangInt2.length;j++) {
						if(mangInt1[i]==mangInt2[j]) {
							 a=mangInt1[i];
							 break;
						}
				}
		  
			tfXuat.setText(tfXuat.getText()+a);
		    tfXuat.setText(tfXuat.getText()+",");
		  } 
		}
	});		
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTim.setBounds(169, 164, 112, 30);
		frame.getContentPane().add(btnTim);
		
		lblNhap2 = new JLabel("Nh\u1EADp m\u1EA3ng 2:");
		lblNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap2.setBounds(10, 86, 102, 25);
		frame.getContentPane().add(lblNhap2);
		
		tfNhap2 = new JTextField();
		tfNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap2.setBounds(111, 82, 287, 30);
		frame.getContentPane().add(tfNhap2);
		tfNhap2.setColumns(10);
		
	}

}
