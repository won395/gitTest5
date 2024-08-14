package frame.layout;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutC extends JFrame{
	
	public GridLayoutC() {
		setSize(500,500);
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,3,15,25));
		
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		add(new Button("6"));
		add(new Button("7"));
		add(new Button("8"));
		add(new Button("9"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutC();
	}

}
