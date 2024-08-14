package frame.component;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonA extends JFrame {
	
	public RadioButtonA() {
		setSize(500, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JRadioButton radio1 = new JRadioButton("아메리카");
		JRadioButton radio2 = new JRadioButton("아시아", true);
		JRadioButton radio3 = new JRadioButton("유럽");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);
		
		add(radio1);
		add(radio2);
		add(radio3);
		
		JButton btn = new JButton("제출");
		add(btn);
		
		
		setVisible(true);
		
		// 라디오를 눌렀을떄 이벤트 처리
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JRadioButton button = (JRadioButton) e.getSource();
				System.out.println(button.getText()+ "선택 되었습니다");
			}
		};
		
		radio1.addActionListener(actionListener);
		radio2.addActionListener(actionListener);
		radio3.addActionListener(actionListener);
		
		btn.addActionListener(e -> {
			if(radio1.isSelected()) {
				System.out.println(radio1.getText()+"선택됨");
			}
			else if(radio2.isSelected()) {
				System.out.println(radio2.getText()+"선택됨");
			}
			else {
				System.out.println(radio3.getText()+"선택됨");
			}
		});
		
		//제출버튼 클릭을 했을떄 최종적으로 무엇을 선택 했는지
		// 콘솔창에 출력
		
		
		
		
		
	}

	public static void main(String[] args) {
		new RadioButtonA();

	}

}
