package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.JButton;

public class mang5 {

	private JFrame frame;
	private JTextField tfNhap1;
	private JTextField tfXuat1;
	private JButton btnTim;
	private JLabel lblNhap2;
	private JTextField tfNhap2;
	private JTextField tfXuat2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mang5 window = new mang5();
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
	public mang5() {
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
		
		JLabel lblNhap1 = new JLabel("Nh\u1EADp m\u1EA3ng s\u1ED1:");
		lblNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap1.setBounds(10, 27, 102, 25);
		frame.getContentPane().add(lblNhap1);
		
		JLabel lblXuat = new JLabel("K\u1EBFt qu\u1EA3");
		lblXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblXuat.setBounds(10, 99, 73, 30);
		frame.getContentPane().add(lblXuat);
		
		tfNhap1 = new JTextField();
		tfNhap1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap1.setBounds(137, 25, 287, 30);
		frame.getContentPane().add(tfNhap1);
		tfNhap1.setColumns(10);
		
		tfXuat1 = new JTextField();
		tfXuat1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat1.setBounds(137, 100, 287, 30);
		frame.getContentPane().add(tfXuat1);
		tfXuat1.setColumns(10);
		
		btnTim = new JButton("S\u1EAFp x\u1EBFp");
		btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//ArrayList<String> nameList= new ArrayList<>();
				String n=tfNhap1.getText();
				String m=tfNhap2.getText();
				String[] mangChuoi1=n.split(",");
				String[] mangChuoi2=m.split(",");
				Integer[] mangInt1= new Integer[mangChuoi1.length];
				for(int i=0;i<mangChuoi1.length;i++) {
					mangInt1[i]=Integer.parseInt(mangChuoi1[i]);
				}

				   int tam1=mangInt1[0];
				   for(int i=0;i<mangInt1.length-1;i++) {
				     for(int j=i+1;j<mangInt1.length;j++) {
				      if(mangInt1[i]>mangInt1[j]) {
				        tam1=mangInt1[i];
				        mangInt1[i]=mangInt1[j];
				          mangInt1[j]=tam1;
                      } 
				     }
				   }				   				 
				     for(int i=0;i<mangInt1.length;i++) {
				         tfXuat1.setText(tfXuat1.getText()+mangInt1[i]);
				          if(i<mangInt1.length-1) {
				            tfXuat1.setText(tfXuat1.getText()+",");
		 }
		 } 
				     Arrays.sort(mangChuoi2);
				     for(int i=0;i<mangChuoi2.length;i++) {
				         tfXuat2.setText(tfXuat2.getText()+mangChuoi2[i]);
				         if(i<mangChuoi2.length-1) {
				            tfXuat2.setText(tfXuat2.getText()+",");
				         }
				     }
		 
		 }
	 });	
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTim.setBounds(167, 176, 112, 30);
		frame.getContentPane().add(btnTim);
		
		lblNhap2 = new JLabel("Nh\u1EADp m\u1EA3ng ch\u1EEF:");
		lblNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhap2.setBounds(10, 63, 112, 25);
		frame.getContentPane().add(lblNhap2);
		
		tfNhap2 = new JTextField();
		tfNhap2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNhap2.setBounds(137, 61, 287, 30);
		frame.getContentPane().add(tfNhap2);
		tfNhap2.setColumns(10);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKtQu.setBounds(10, 132, 112, 30);
		frame.getContentPane().add(lblKtQu);
		
		tfXuat2 = new JTextField();
		tfXuat2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfXuat2.setBounds(136, 135, 288, 30);
		frame.getContentPane().add(tfXuat2);
		tfXuat2.setColumns(10);
		
	}
}
