package Fram.layout;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutB extends JFrame {
	
	public BorderLayoutB() {
		setSize(500, 500);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new JButton("버튼 1"), BorderLayout.NORTH);
		add(new JButton("버튼 2"), BorderLayout.SOUTH);
		add(new JButton("버튼 3"), BorderLayout.WEST);
		add(new JButton("버튼 4"), BorderLayout.EAST);
		add(new JButton("버튼 5"), BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutB();

	}

}
