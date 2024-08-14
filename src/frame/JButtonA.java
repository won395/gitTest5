package frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonA extends JFrame{
	
	public JButtonA() {
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//버튼 생성
		JButton btn = new JButton("버튼1");
		//버튼을 layout(frame 추가)
		add(btn);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JButtonA();
	}

}