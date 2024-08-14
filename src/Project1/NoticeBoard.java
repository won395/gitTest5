package Project1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class NoticeBoard extends JFrame {
	
	private JTextField usernameField;
	private JTextArea messageArea;
	private JTextArea chatArea;
	private MessageManager messageManager;
	
	public NoticeBoard() {
		
		messageManager = new MessageManager();
		
		setTitle("게시판");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		usernameField = new JTextField(20);
		messageArea = new JTextArea(5, 20);
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		JScrollPane chatScroll = new JScrollPane(chatArea);
		
		JPanel inputJPanel = new JPanel();
		inputJPanel.setLayout(new BorderLayout());
		inputJPanel.add(new JLabel("닉네임: "), BorderLayout.WEST);
		inputJPanel.add(usernameField, BorderLayout.CENTER);
		
		JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BorderLayout());
        messagePanel.add(new JLabel("Message:"), BorderLayout.WEST);
        messagePanel.add(new JScrollPane(messageArea), BorderLayout.CENTER);
        
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String username = usernameField.getText();
				String message = messageArea.getText();
				if (!username.isEmpty() && !message.isEmpty()) {
					messageManager.addMessage(username, message);
					messageArea.setText("");
					loadMessages();
				} else {
					JOptionPane.showMessageDialog(NoticeBoard.this, "Username and message cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
        
        JButton addroomButton = new JButton("게시글 쓰기");
        addroomButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new Postroom();
			}
		});
        
        JPanel sendPanel = new JPanel();
        sendPanel.setLayout(new BorderLayout());
        sendPanel.add(sendButton, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(messagePanel, BorderLayout.CENTER);
        bottomPanel.add(sendPanel, BorderLayout.EAST);
        
        add(inputJPanel, BorderLayout.NORTH);
        add(chatScroll, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(addroomButton, BorderLayout.NORTH);
        loadMessages();
		
		setVisible(true);
	}
	
	private void loadMessages() {
        String messages = messageManager.getMessages();
        chatArea.setText(messages);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	NoticeBoard chatBoard = new NoticeBoard();
                chatBoard.setVisible(true);
            }
        });
	}

}
