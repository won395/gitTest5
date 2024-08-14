package frame.component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDisp extends JFrame {
	
	public ImageDisp() {
		setTitle("이미지 불러오기");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//String str = "C:/javaTest/img.gif";
		// 경로 지정할때 / , \\됨(애는 두개 쳐야됨)
		// 경로 지정하기
		ImageIcon imageIcon = new ImageIcon("C:\\javaTest\\img.gif");
		JLabel label = new JLabel(imageIcon);
		
		add(label);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ImageDisp();
	}

}
