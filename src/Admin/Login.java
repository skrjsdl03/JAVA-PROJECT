package Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import User.UserShop;

public class Login {
	private String id;
	private String pw;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setFont(new Font("Gulim", Font.PLAIN, 12));
		frame.setBounds(100, 100, 597, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("XX회사");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 50));
		lblNewLabel.setBounds(206, 69, 175, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디(이름)");
		lblNewLabel_1.setBounds(118, 196, 77, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("패스워드(사원번호)");
		lblNewLabel_2.setBounds(84, 237, 111, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(207, 193, 223, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 234, 224, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnNewButton) {
					id = textField.getText();
					pw = textField_1.getText();
					System.out.println(id + pw);
					if(id.equals("admin") && pw.equals("1234")) {
						
						JOptionPane.showMessageDialog(null,"관리자 로그인 완료");
						frame.dispose();
						Manager_1 Mg=new Manager_1();
						Mg.setVisible(true);
						Mg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
					
					else if(id.equals("최주영") && pw.equals("20212503")) {
						JOptionPane.showMessageDialog(null,"사용자 로그인 완료");
						User.UserShop userShop = new UserShop();
					}
					
					else {
						JOptionPane.showMessageDialog(null,"로그인 실패");
					}
	      		}
				

			}
		});
		btnNewButton.setBounds(467, 212, 91, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

