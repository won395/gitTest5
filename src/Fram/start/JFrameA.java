package Fram.start;

import java.awt.*;
import javax.swing.*;

public class JFrameA {

	//메인에서 사용할떄 주로 사용
	//중첩클래스, 로컬클래스 개념으로도 사용할 수 있습니다
	//이방법은 추천하지 못함(메인은 한번만 실행되기 때문에)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jFrame = new JFrame();
		
		//크기조절
				//메게변수 ("가로길이", "세로길이");
		jFrame.setSize(300, 500);
		
		//생성시, 위치조정 (생략가능) - (x측, y측)
		jFrame.setLocation(0, 100);
		
		//x 버튼을 눌렀을떄 동작 옵션 // 오류남
		//jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jFrame.setVisible(true);

	}

}
