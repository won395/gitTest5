package Project1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChatProgram extends JFrame {
	
    private static ChatData db = new ChatData();
    private JTextField usernameField;
    private JTextField messageField;
    private JTextField deleteField;
    private JTextArea chataArea;
    
public ChatProgram() {
	
	setTitle("채팅 프로그램");
	setSize(500, 500);
	setLocation(0, 100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());
	
	
	// 채팅 글씨체? 글자
	chataArea = new JTextArea();
	chataArea.setEditable(false);  //폰트 색상 변경 제한 없앰
	add(new JScrollPane(chataArea), BorderLayout.CENTER);
	
	// 패널
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(5, 4));
	
	// 유저명
	panel.add(new JLabel("유저 이름: "));
	usernameField = new JTextField();
	panel.add(usernameField);
	
	// 메시지
	panel.add(new JLabel("메시지: "));
	messageField = new JTextField();
	panel.add(messageField);
	
	
	// 삭제 여부
	panel.add(new JLabel("메시지를 삭제 하시겠습니까?"));
	deleteField = new JTextField();
	panel.add(deleteField);
	
	// 보내기 버튼
	JButton sendButton = new JButton("Send");
	sendButton.addActionListener(new SendButtonListener());
	panel.add(sendButton);
	
	// 삭제 버튼
	JButton delButton = new JButton("Delete");
	delButton.addActionListener(new DeleteButtonListener());
	panel.add(delButton);
	
	add(panel, BorderLayout.SOUTH);
	
	setVisible(true);
}

	//send 버튼 기능
	private class SendButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String username = usernameField.getText();
			String message = messageField.getText();
			db.addMessage(username, message);
			chataArea.append(username + " : " + message + "\n");
			messageField.setText("");
		}
	}
	
	//delete 버튼 기능
	private class DeleteButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int id = Integer.parseInt(deleteField.getText());
			db.deleteMessage(id);
			chataArea.append("메시지" + id + "삭제" + "\n");
			deleteField.setText("");
		}
	}
		


    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new ChatProgram());
    	
    	// SwingUtilities
    	// invokeLater 나중에 호출한다(즉, 거꾸로 출력됨)
    }
}

