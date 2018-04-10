package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bài5 {

	private JFrame frame;
	private JTextField txtnhap;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bài5 window = new Bài5();
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
	public Bài5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(100, 100, 379, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtnhap = new JTextField();
		txtnhap.setBounds(132, 33, 166, 37);
		frame.getContentPane().add(txtnhap);
		txtnhap.setColumns(10);
		
		txtketqua = new JTextField();
		txtketqua.setColumns(10);
		txtketqua.setBounds(132, 159, 166, 52);
		frame.getContentPane().add(txtketqua);
		
		JButton btnNewButton = new JButton("\u0110\u1ED5i");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nhap=txtnhap.getText();
				String a=nhap.toUpperCase();
				txtketqua.setText(a);
				txtnhap.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(157, 106, 123, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Chu\u1ED7i :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 42, 81, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("K\u1EBFt Qu\u1EA3 :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 176, 81, 16);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setTitle("Bài 4");
	}

}
