package frame.join;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MLogin extends JFrame implements ActionListener{
	
	private JTextField userTextField;				//id 입력 창
	private JPasswordField passwordField;			//비밀번호 입력 창
	private JButton loginButton;					//로그인 버튼
	private JButton joinButton;						//회원가입 버튼
	
	public MLogin() {
		MemberDAO memberDAO = new MemberDAO();
		setTitle("로그인 화면");						//frame 제목
		setSize(300, 150);							//frame 크기
		setLocationRelativeTo(null);				//화면의 가운데 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//닫기 버튼
		
		setLayout(new GridLayout(3, 2, 10, 10));
		
		// 사용자 아이디 입력
		add(new JLabel("ID: "));
		userTextField = new JTextField();
		add(userTextField);
		
		// 사용자 비밀번호 입력
		add(new JLabel("PW: "));
		passwordField = new JPasswordField();
		add(passwordField);
		
		loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		add(loginButton);
		
		joinButton = new JButton("Join");
		joinButton.addActionListener(this);
		add(joinButton);
		
		
		setVisible(true);
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = userTextField.getText();
				String password = new String(passwordField.getPassword());
				
				if(memberDAO.login(name, password)) {
					JOptionPane.showMessageDialog(MLogin.this, "성공");
				} else {
					JOptionPane.showMessageDialog(MLogin.this, "실패");
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("click");
		Object obj = e.getSource();	//주소. ( stack )
		if(obj == loginButton) //값을 비교하지만, 정확히는 서로의 주소가 같은지 비교하는 것.
		{
			System.out.println("loginButton click");
		}
		else if(obj == joinButton)
		{
			new MemberJoin();
			dispose();
		}
		
	}
	
	public static void main(String[] args) {
		new MLogin();
	}

}