package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyUser window = new MyUser();
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
	public MyUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(this.getClass().getResource("/employee.jpg")); //이미지 파일명
		
	    
		JLabel Time = new JLabel("시간) 2022-11-14//07-56 (출근시간");
		Time.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		Time.setBounds(201, 23, 350, 50);
		frame.getContentPane().add(Time);
		
		JLabel Name = new JLabel("이름 | 이창건");
		Name.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Name.setBounds(201, 73, 133, 50);
		frame.getContentPane().add(Name);
		
		JLabel Position = new JLabel("직급 | 인턴");
		Position.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Position.setBounds(201, 103, 100, 50);
		frame.getContentPane().add(Position);
		
		JLabel Department = new JLabel("부서 | 개발자");
		Department.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Department.setBounds(201, 133, 133, 50);
		frame.getContentPane().add(Department);
		
		JLabel Ppoint = new JLabel("상벌점 | 0");
		Ppoint.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		Ppoint.setBounds(201, 163, 150, 50);
		frame.getContentPane().add(Ppoint);
		
		JButton StoreBtn = new JButton("상점");
		StoreBtn.setFont(new Font("Dialog", Font.PLAIN, 18));
		StoreBtn.setBounds(351, 203, 100, 50);
		frame.getContentPane().add(StoreBtn);
		
		JButton InventoryBtn = new JButton("내 가방");
		InventoryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==InventoryBtn) {
	      			JOptionPane.showMessageDialog(null,"로그인 완료");
	      		}
				
				frame.dispose();
				MyInventory Mi=new MyInventory();
				Mi.setVisible(true);
				Mi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		InventoryBtn.setFont(new Font("Dialog", Font.PLAIN, 18));
		InventoryBtn.setBounds(461, 203, 100, 50);
		frame.getContentPane().add(InventoryBtn);
		
		ImageIcon img = new ImageIcon("C:\\Users\\이창건\\Desktop\\다시 만든 프로젝트\\JavaProject\\img\\employee.jpg");
		JLabel Image = new JLabel(img, JLabel.CENTER);
		//imageLabel.setBounds(30, 30, 150, 187);
		Image.setBounds(30, 40, 164, 161);
		frame.getContentPane().add(Image);
	}
}
