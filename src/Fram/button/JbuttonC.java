package Fram.button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JbuttonC extends JFrame {
	
	public JbuttonC() {
		setSize(300, 500);
		setLocation(110, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 버튼 닫을떄 참고사항
		//DO_NOTHING_ON_CLOSE: 닫기 버튼을 눌러도 동작하지 읺음
		//HIDE_ON_CLOSE: 프레임 숨기기
		//DISPOSE_ON_CLOSE: 프레인 닫고, 프레임과 관련된 자원을 해제
		//EXIT_ON_CLOSE:전체 프로그램 종료
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//버튼 생성
		JButton btn = new JButton("버튼2");
		add(btn);
		
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("버튼 클릭");
			}
		});
		
		btn.addActionListener(e -> { new JbuttonB(); dispose(); });
	}

	public static void main(String[] args) {
		new JbuttonC();
	}
}