package Fram.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutA extends JFrame {
	
	public FlowLayoutA() {
		setSize(500, 500);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		JButton btn4 = new JButton("버튼 4");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutA();
	}

}