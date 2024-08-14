package frame.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import frame.JButtonA;

public class Calculator extends JFrame {
	
	public Calculator() {
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JTextField text1 = new JTextField(4);
		JTextField text2 = new JTextField(4);
		
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("×");
		JButton btn4 = new JButton("÷");
		
		add(text1);
		add(text2);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		btn1.addActionListener(e -> {
			String txt1 =text1.getText();
			String txt2 =text2.getText();
			
			int num1 = Integer.parseInt(txt1);
			int num2 = Integer.parseInt(txt2);
			
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		});
		
		btn2.addActionListener(e -> {
			String txt1 =text1.getText();
			String txt2 =text2.getText();
			
			int num1 = Integer.parseInt(txt1);
			int num2 = Integer.parseInt(txt2);
			
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		});
		
		btn3.addActionListener(e -> {
			String txt1 =text1.getText();
			String txt2 =text2.getText();
			
			int num1 = Integer.parseInt(txt1);
			int num2 = Integer.parseInt(txt2);
			
			System.out.println(num1+"×"+num2+"="+(num1*num2));
		});
		
		btn4.addActionListener(e -> {
			String txt1 =text1.getText();
			String txt2 =text2.getText();
			
			int num1 = Integer.parseInt(txt1);
			int num2 = Integer.parseInt(txt2);
			
			System.out.println(num1+"÷"+num2+"="+(num1/num2));
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
