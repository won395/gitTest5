package frame.button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JButtonB extends JFrame {

	public JButtonB() {
		setSize(300,500);
		setLocation(0,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btn = new JButton("버튼1");
		add(btn);
		setVisible(true);
		
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("Clicked");
//			}
//		});
		btn.addActionListener(e -> {
			System.out.println("Lamda Clicked");
			new JButtonB();
		});
	}
	public static void main(String[] args) {		
		new JButtonB();
	}

}