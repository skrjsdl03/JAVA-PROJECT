package Gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;

public class MyInventory {
	
	private int vacation = 0;
	private int halfvacation = 0;
	private int point = 0;
	
	private JFrame frame;
	private JLabel TheUse;
	private JLabel SpecialProduct;
	private JLabel Point;
	private JTextArea SpecialProductAll;
	private JTextArea PointAll;
	private JTextArea PointList;
	private JTextArea SpecialProductList;
	private JTextArea TheUseList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyInventory window = new MyInventory();
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
	public MyInventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("내 가방");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		LineBorder bb = new LineBorder(Color.black, 1, true); 
		JTextArea TheUseAll = new JTextArea();
		TheUseAll.setLineWrap(true);
		TheUseAll.setEditable(false);
		TheUseAll.setBackground(Color.LIGHT_GRAY);
		TheUseAll.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		TheUseAll.setText("휴가 | " + vacation + "개\r\n반차 | " + halfvacation + "개\r\n");
		TheUseAll.setBounds(0, 208, 144, 55);
		TheUseAll.setBorder(bb);
		frame.getContentPane().add(TheUseAll);

		TheUse = new JLabel("사용권");
		TheUse.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		TheUse.setHorizontalAlignment(SwingConstants.CENTER);
		TheUse.setBounds(0, 0, 144, 48);
		TheUse.setBorder(bb);
		frame.getContentPane().add(TheUse);
		
		SpecialProduct = new JLabel("특별상품");
		SpecialProduct.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		SpecialProduct.setHorizontalAlignment(SwingConstants.CENTER);
		SpecialProduct.setBounds(146, 0, 144, 48);
		SpecialProduct.setBorder(bb);
		frame.getContentPane().add(SpecialProduct);
		
		Point = new JLabel("상/벌점");
		Point.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		Point.setHorizontalAlignment(SwingConstants.CENTER);
		Point.setBounds(292, 0, 144, 48);
		Point.setBorder(bb);
		frame.getContentPane().add(Point);
		
		SpecialProductAll = new JTextArea();
		SpecialProductAll.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		SpecialProductAll.setText("특별상품이 없습니다");
		
		SpecialProductAll.setLineWrap(true);
		SpecialProductAll.setBackground(Color.LIGHT_GRAY);
		SpecialProductAll.setBounds(146, 208, 144, 55);
		SpecialProductAll.setBorder(bb);
		frame.getContentPane().add(SpecialProductAll);
		
		PointAll = new JTextArea();
		if(point >= 0)
			PointAll.setText("상점 | " + point + "점\r\n벌점 | 0점");
		else
			PointAll.setText("상점 | 0점\r\n벌점 | " + (-point) + "점");
		PointAll.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		PointAll.setLineWrap(true);
		PointAll.setBackground(Color.LIGHT_GRAY);
		PointAll.setBounds(292, 208, 148, 55);
		PointAll.setBorder(bb);
		frame.getContentPane().add(PointAll);
		
		PointList = new JTextArea();
		PointList.setBackground(Color.LIGHT_GRAY);
		PointList.setBounds(292, 48, 144, 162);
		PointList.setBorder(bb);
		frame.getContentPane().add(PointList);
		
		SpecialProductList = new JTextArea();
		SpecialProductList.setBackground(Color.LIGHT_GRAY);
		SpecialProductList.setBounds(146, 48, 144, 162);
		SpecialProductList.setBorder(bb);
		frame.getContentPane().add(SpecialProductList);
		
		TheUseList = new JTextArea();
		TheUseList.setBackground(Color.LIGHT_GRAY);
		TheUseList.setBounds(0, 48, 144, 162);
		TheUseList.setBorder(bb);
		frame.getContentPane().add(TheUseList);
	}
}

