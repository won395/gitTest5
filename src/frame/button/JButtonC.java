package frame.button;

import java.awt.FlowLayout;

import javax.swing.*;

public class JButtonC extends JFrame{
	
	public JButtonC() {
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn = new JButton("버튼2");
		//버튼 layout 추가
		add(btn);
		
		setVisible(true);
		
		btn.addActionListener(e -> {
			new JButtonB();
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JButtonC();
		
	}

}