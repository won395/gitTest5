package frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//버튼 클릭 event
public class JButtonB extends JFrame {

	public JButtonB() {
		setSize(300, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// 버튼 생성
		JButton btn = new JButton("버튼1");
		// 버튼을 layout(frame 추가)
		add(btn);

		setVisible(true);

		// btn을 눌렀을 때, 어떻게 할 것인지. (class)

		btn.addActionListener(new ActionListener() {

			// 버튼 클릭했을 때, 발생되는 event를 여기서 처리

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("btn 클릭 확인");
			}
		});

		// 람다식 ( 초심자 배려 x )
		// 추상 메소드가 ★한 개만 포함 된 인터페이스 혹은 추상 클레스에만 적용
		btn.addActionListener(e -> {
			System.out.println("btn 클릭");
		});

	}

	public static void main(String[] args) {
		new JButtonB();
	}

}

