package frame.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combobox extends JFrame {
	
	public Combobox() {
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String[] arrList = { "슈퍼맨", "배트맨", "조커" };
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		comboBox.addItem("슈퍼맨");
		//add(); <= 
		
		add(comboBox);
		setVisible(true);
		// 콤보박스 내용을 변경 할떄 적용
		// 버튼에서 하게되면, 버튼 누르는 순간 최종적으로 콤보박스 설정 내용저장
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Object obj = comboBox.getSelectedItem();
				System.out.print("선택된 항목: ", obj);
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		new Combobox();
	}

}
