package frame.component;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class CheckBoxA extends JFrame {
	
	public CheckBoxA() {
		setSize(500, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JCheckBox check1 = new JCheckBox("파랑");
		JCheckBox check2 = new JCheckBox("빨강");
		JCheckBox check3 = new JCheckBox("초록");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(check1);
		add(check2);
		add(check3);
		JButton btn = new JButton("제출");
		add(btn);
		
		
		setVisible(true);
		
		
		check1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String result = (e.getStateChange() == ItemEvent.SELECTED? "선택됨 ": "선택안함");
				System.out.println("파랑: "+ result);
				// e.getItem(); <= 입력값 갖고오는 함수
				
			}
		});
		
		btn.addActionListener(e -> {
			if(check1.isSelected()) {
				System.out.println(check1.getText()+"선택됨");
			}
			if(check2.isSelected()) {
				System.out.println(check2.getText()+"선택됨");
			}
			if(check3.isSelected()) {
				System.out.println(check3.getText()+"선택됨");
			}
		});
		
		
	}

	public static void main(String[] args) {
		new CheckBoxA();

	}

}
