package Fram.layout;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.*;
import javax.swing.*;

public class GridLayoutC extends JFrame {
	
	public GridLayoutC() {
		setSize(500, 500);
		setLocation(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//매개변수
		//2개: 행, 열
		//4개: 행, 열, 열끼리 간격, 행끼리 간격
		setLayout(new GridLayout(3, 3, 15, 25));
		
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
		
		new GridBagLayout();

	}

}