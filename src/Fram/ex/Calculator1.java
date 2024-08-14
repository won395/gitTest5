package Fram.ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator1 extends JFrame {
	
	public Calculator1() {
		setSize(300, 500);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JTextField n1 = new JTextField(10);
		JTextField n2 = new JTextField(10);
		
		JButton add = new JButton("+");
		JButton min = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		
		JButton result = new JButton(); //tostring 쓰기 귀찮아서 이거씀 나오긴하잖아
		
		add(n1);
		add(n2);
		add(add);
		add(min);
		add(mul);
		add(div);
		add(result);
		
		setVisible(true);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(Integer.toString(Integer.parseInt(n1.getText())+Integer.parseInt(n2.getText())));
				
			}
		});
		
		min.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(Integer.toString(Integer.parseInt(n1.getText())-Integer.parseInt(n2.getText())));
			}
		});
		
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(Integer.toString(Integer.parseInt(n1.getText())*Integer.parseInt(n2.getText())));
			}
		});
		
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(Integer.toString(Integer.parseInt(n1.getText())/Integer.parseInt(n2.getText())));
			}
		});
	}

	public static void main(String[] args) {
		new Calculator1();
	}
}