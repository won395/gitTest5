package frame.join;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemberJoin extends JFrame{
	
	MemberDAO memberDAO; 
	
	public MemberJoin() {
		memberDAO = new MemberDAO();
		
		setTitle("회원가입 창");
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10, 10));
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 2, 5, 5));
		//패딩 추가 ( 안쪽 간격 )
		formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//필드 꾸미기
		JLabel nameLabel = new JLabel("이름: ");
		JTextField nameTextField = new JTextField();
		
		JLabel passwordLabel = new JLabel("비밀번호: ");
		JPasswordField passwordTextField = new JPasswordField();
		
		JLabel emailLabel = new JLabel("이메일: ");
		JTextField emailTextField = new JTextField();
		
		//가입 버튼 생성
		JButton joinActionButton = new JButton("가입하기");
		//버튼 스타일 변경
		joinActionButton.setBackground(Color.LIGHT_GRAY);
		//폰트 변경, 이클립스에 해당 FONT가 있어야지만 적용.
		joinActionButton.setFont(new Font("Serif", Font.BOLD, 16));
		
		
		//패널 추가
		formPanel.add(nameLabel);
		formPanel.add(nameTextField);
		
		formPanel.add(passwordLabel);
		formPanel.add(passwordTextField);
		
		formPanel.add(emailLabel);
		formPanel.add(emailTextField);
		
		formPanel.add(joinActionButton);
		add(formPanel, BorderLayout.CENTER);
		
		setVisible(true);
		
		joinActionButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TEXT 입력값 불러오기
				String nameText = nameTextField.getText();
				String passwordText = passwordTextField.getText();
				String emailText = emailTextField.getText();
				
				//이름 중복 체크 ( PK CHECK )
				if(memberDAO.selectNameCheck(nameText) > 0) {
					System.out.println("중복 된 이름입니다.");
					return ;
				}
				
				//이 값이 성공했는지, 실패했는지 확인하고 싶다!
				int result = memberDAO.memberInsert(nameText, passwordText, emailText);	//회원가입 INSERT
				//회원가입 성공
				if(result > 0) {
					System.out.println("성공!");	//console
					dispose();					//창 닫기
					new MLogin();				//다음 페이지 열기
				}
				//회원가입 실패
				else {
					System.out.println("회원가입 실패!");
					JOptionPane.showMessageDialog(MemberJoin.this, "회원가입 실패!");
				}
			}
		});
	}
	
	//가입하기 누르면, 해당 창 닫고. 로그인화면으로 가면 됩니다.
	//되도록이면, 어제 사용한 EVENT 방법으로 해주세요.


	public static void main(String[] args) {
		new MemberJoin();
	}
}