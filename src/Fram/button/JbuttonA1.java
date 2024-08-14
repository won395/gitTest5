package Fram.button;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JbuttonA1 extends JFrame {
	
	public JbuttonA1() {
		System.out.println("test");
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//버튼 생성
		JButton btn = new JButton("버튼1");
		//버튼을 레이아웃(프레임 추가)
		add(btn);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("123");
		new JbuttonA1();

	}

}
