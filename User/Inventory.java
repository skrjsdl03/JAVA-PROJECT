package Gui;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class Inventory extends JFrame{
	
	private int vacation = 0;
	private int halfvacation = 0;
	private int point = 0;
	
	private JFrame frame;
	private JLabel TheUse;
	private JLabel SpecialProduct;
	private JLabel Point;
	private JTextArea SpecialProductResult;
	private JTextArea PointResult;
	private JTextArea PointList;
	private JTextArea SpecialProductList;
	private JTextArea TheUseList;
	
	public Inventory()
	{
		setTitle("내 가방");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setLayout(null);
		
		LineBorder bb = new LineBorder(Color.black, 1, true); 
		JTextArea TheUseResult = new JTextArea();
		TheUseResult.setLineWrap(true);
		TheUseResult.setEditable(false);
		TheUseResult.setBackground(Color.LIGHT_GRAY);
		TheUseResult.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		TheUseResult.setText("휴가 | " + vacation + "개\r\n반차 | " + halfvacation + "개\r\n");
		TheUseResult.setBounds(0, 208, 144, 55);
		TheUseResult.setBorder(bb);
		c.add(TheUseResult);

		TheUse = new JLabel("사용권");
		TheUse.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		TheUse.setHorizontalAlignment(SwingConstants.CENTER);
		TheUse.setBounds(0, 0, 144, 48);
		TheUse.setBorder(bb);
		c.add(TheUse);
		
		SpecialProduct = new JLabel("특별상품");
		SpecialProduct.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		SpecialProduct.setHorizontalAlignment(SwingConstants.CENTER);
		SpecialProduct.setBounds(146, 0, 144, 48);
		SpecialProduct.setBorder(bb);
		c.add(SpecialProduct);
		
		Point = new JLabel("상/벌점");
		Point.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		Point.setHorizontalAlignment(SwingConstants.CENTER);
		Point.setBounds(292, 0, 144, 48);
		Point.setBorder(bb);
		c.add(Point);
		
		SpecialProductResult = new JTextArea();
		SpecialProductResult.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		SpecialProductResult.setText("특별상품이 없습니다");
		
		SpecialProductResult.setLineWrap(true);
		SpecialProductResult.setBackground(Color.LIGHT_GRAY);
		SpecialProductResult.setBounds(146, 208, 144, 55);
		SpecialProductResult.setBorder(bb);
		c.add(SpecialProductResult);
		
		PointResult = new JTextArea();
		if(point >= 0)
			PointResult.setText("상점 | " + point + "점\r\n벌점 | 0점");
		else
			PointResult.setText("상점 | 0점\r\n벌점 | " + (-point) + "점");
		PointResult.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		PointResult.setLineWrap(true);
		PointResult.setBackground(Color.LIGHT_GRAY);
		PointResult.setBounds(292, 208, 148, 55);
		PointResult.setBorder(bb);
		c.add(PointResult);
		
		PointList = new JTextArea();
		PointList.setBackground(Color.LIGHT_GRAY);
		PointList.setBounds(292, 48, 144, 162);
		PointList.setBorder(bb);
		//상점 얻으면 "상점 1점 회득" 텍스트 올림
		//벌점 얻으면 "벌점 1점 획득" 텍스트 올림
		c.add(PointList);
		
		SpecialProductList = new JTextArea();
		SpecialProductList.setBackground(Color.LIGHT_GRAY);
		SpecialProductList.setBounds(146, 48, 144, 162);
		SpecialProductList.setBorder(bb);
		//특별 상품 얻으면 SpecialProductList에 "특별상품(이름) 1개 획득" 텍스트 올림
		c.add(SpecialProductList);
		
		TheUseList = new JTextArea();
		TheUseList.setBackground(Color.LIGHT_GRAY);
		TheUseList.setBounds(0, 48, 144, 162);
		TheUseList.setBorder(bb);
		//휴가 얻으면 TheUseList에 "휴가 1개 획득" 텍스트 올림
		//반차 얻으면 TheUseList에 "반차 1개 획득" 텍스트 올림
		c.add(TheUseList);
		
		setSize(450,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Inventory();

	}

}
