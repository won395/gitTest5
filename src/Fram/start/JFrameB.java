package Fram.start;

import java.awt.FlowLayout;

import javax.swing.JFrame;

//class 불러오는 방법 - 상속
public class JFrameB extends JFrame {
	
	public JFrameB() {
		System.out.println("생성자 실행");
		
		setSize(300, 500);
		setLocation(0, 100);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//생략 가능 layout 필수 기능 중 하나 - 꾸미는 용도
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//화면표시(false - 감추기, true - 표시)
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameB();

	}

}