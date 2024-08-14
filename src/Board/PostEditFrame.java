package Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PostEditFrame extends JFrame {
    private JTextField titleField;
    private JTextArea contentArea;
    private JButton saveButton;
    private JButton cancelButton;
    private JButton attachImageButton;
    private JLabel imagePathLabel;  // 파일 경로를 표시할 라벨
    private File selectedFile;      // 선택된 파일 객체
    private Post post;
    private BoardMain boardMain;
    
    private DefaultListModel<String> commentListModel;
    private JList<String> commentList;

    public PostEditFrame(BoardMain boardMain) {
        this.boardMain = boardMain;
        setTitle("새 게시물");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창 닫기 동작 설정
        initialize();
    }

    public PostEditFrame(Post post, BoardMain boardMain) {
        this.post = post;
        this.boardMain = boardMain;
        setTitle("게시물 수정");
        initialize();
    }

    private void initialize() {
        setSize(600, 700);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        titleField = new JTextField();
        contentArea = new JTextArea();
        contentArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(contentArea);

        if (post != null) {
            titleField.setText(post.getTitle());
            contentArea.setText(post.getContent());
        }
        
        attachImageButton = new JButton("사진 첨부");
        imagePathLabel = new JLabel("선택된 파일 없음");

        attachImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attachImage();
            }
        });

        saveButton = new JButton("저장");
        cancelButton = new JButton("취소");

        panel.add(new JLabel("제목:"));
        panel.add(titleField);
        panel.add(new JLabel("내용:"));
        panel.add(scrollPane);
        
        JPanel filePanel = new JPanel(new BorderLayout());
        filePanel.add(attachImageButton, BorderLayout.WEST);
        filePanel.add(imagePathLabel, BorderLayout.CENTER);

        panel.add(filePanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                savePost();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
    
    // 사진 첨부 메서드
    private void attachImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            imagePathLabel.setText(selectedFile.getAbsolutePath());
        }
    }

    private void savePost() {
        String newTitle = titleField.getText();
        String newContent = contentArea.getText();
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        try {
            // 파일 생성 (file_path를 필요에 맞게 수정)
            int fileId = Dataconn.createFile("default_file_path");
            
            if (fileId == 0) {
                JOptionPane.showMessageDialog(this, "파일 생성에 실패했습니다.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (post == null) {
                // New post
                Dataconn.createPost(1, 1, newContent, newTitle, currentTimestamp, false, currentTimestamp, fileId, false);
                JOptionPane.showMessageDialog(this, "게시판 생성 성공!");
            } else {
                // Edit existing post
                Dataconn.updatePost(post.getPostId(), post.getUserId(), post.getChatroomId(), newContent, newTitle, new Timestamp(post.getCreatedAt().getTime()), post.isDelete(), currentTimestamp, fileId, post.isNotice());
                JOptionPane.showMessageDialog(this, "게시판 업데이트 성공!");
            }

            boardMain.loadPosts();
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving post: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
