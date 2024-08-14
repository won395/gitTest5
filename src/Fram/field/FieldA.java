package Fram.field;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FieldA extends JFrame {
	
	public FieldA() {
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JTextField text = new JTextField(10);
		JButton btn1 = new JButton("Click");
		
		add(text);
		add(btn1);
		
		setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String txt = text.getText();
				System.out.println(txt);
			}
		});
	}

	public static void main(String[] args) {
		new FieldA();

	}

}
