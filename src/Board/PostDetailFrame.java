package Board;

import javax.swing.*;
import comments.CDataconn;
import comments.Comment;
import comments.CommentFrame;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class PostDetailFrame extends JFrame {
    private JTextField titleField;
    private JTextArea contentArea;
    private JButton saveButton;
    private JButton cancelButton;
    private Post post;
    private BoardMain boardMain;

    // 댓글 관련 필드 추가
    private DefaultListModel<String> commentListModel;
    private JList<String> commentList;
    private JButton addCommentButton;
    private JButton viewCommentsButton; // 댓글 확인 버튼

    public PostDetailFrame(Post post, BoardMain boardMain) {
        this.post = post;
        this.boardMain = boardMain;
        setTitle("게시물 수정");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창 닫기 동작 설정
        initialize();
    }

    private void initialize() {
        setSize(600, 700);
        setLayout(new BorderLayout());

        // 제목 패널
        JPanel titlePanel = new JPanel(new BorderLayout());
        titleField = new JTextField(post.getTitle());
        titlePanel.add(new JLabel("제목:"), BorderLayout.WEST);
        titlePanel.add(titleField, BorderLayout.CENTER);
        add(titlePanel, BorderLayout.NORTH);

        // 내용 패널
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentArea = new JTextArea(post.getContent());
        contentArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(contentArea);
        contentPanel.add(new JLabel("내용:"), BorderLayout.NORTH);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        add(contentPanel, BorderLayout.CENTER);

        // 댓글 패널
        JPanel commentPanel = new JPanel(new BorderLayout());
        commentListModel = new DefaultListModel<>();
        commentList = new JList<>(commentListModel);
        JScrollPane commentScrollPane = new JScrollPane(commentList);
        commentPanel.add(new JLabel("댓글:"), BorderLayout.NORTH);
        commentPanel.add(commentScrollPane, BorderLayout.CENTER);
        add(commentPanel, BorderLayout.SOUTH);

        // 버튼 패널
        JPanel buttonPanel = new JPanel();
        saveButton = new JButton("저장");
        cancelButton = new JButton("취소");
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        // 댓글 쓰기 버튼 추가
        addCommentButton = new JButton("댓글 쓰기");
        addCommentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCommentFrame();
            }
        });
        buttonPanel.add(addCommentButton);

        // 댓글 확인 버튼 추가
        viewCommentsButton = new JButton("댓글 확인");
        viewCommentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewComments();
            }
        });
        buttonPanel.add(viewCommentsButton);

        add(buttonPanel, BorderLayout.PAGE_END);

        // 저장 버튼 리스너
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                savePost();
            }
        });

        // 취소 버튼 리스너
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        loadComments(); // 댓글 로드
        setVisible(true);
    }

    // 댓글을 데이터베이스에서 불러오는 메서드
    private void loadComments() {
        try {
            List<Comment> comments = CDataconn.getCommentsForPost(post.getPostId());
            commentListModel.clear();
            for (Comment comment : comments) {
                String displayText = comment.getUserName() + ": " + comment.getContent();
                commentListModel.addElement(displayText);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 댓글 확인을 위한 새로운 창 열기
    private void viewComments() {
        JFrame commentViewFrame = new JFrame("댓글 확인");
        commentViewFrame.setSize(400, 300);
        commentViewFrame.setLayout(new BorderLayout());

        JList<String> commentViewList = new JList<>(commentListModel);
        JScrollPane commentViewScrollPane = new JScrollPane(commentViewList);

        commentViewFrame.add(commentViewScrollPane, BorderLayout.CENTER);

        commentViewFrame.setVisible(true);
    }

    private void openCommentFrame() {
        JFrame commentFrame = new JFrame("댓글 쓰기");
        commentFrame.setSize(400, 300);
        commentFrame.setLayout(new BorderLayout());

        JTextArea commentArea = new JTextArea();
        JButton submitButton = new JButton("댓글 달기");

        commentFrame.add(new JScrollPane(commentArea), BorderLayout.CENTER);
        commentFrame.add(submitButton, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = commentArea.getText();
                if (content.isEmpty()) {
                    JOptionPane.showMessageDialog(commentFrame, "댓글 내용을 입력하세요.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
                try {
                    CDataconn.addComment(post.getPostId(), 1, content, currentTimestamp); // userId는 실제 사용자 ID로 대체
                    loadComments();
                    commentFrame.dispose();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(commentFrame, "댓글 추가 실패: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        commentFrame.setVisible(true);
    }

    private void savePost() {
        String newTitle = titleField.getText();
        String newContent = contentArea.getText();
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        try {
            // 게시물 업데이트
            Dataconn.updatePost(post.getPostId(), post.getUserId(), post.getChatroomId(), newContent, newTitle, 
                                new Timestamp(post.getCreatedAt().getTime()), post.isDelete(), currentTimestamp, 
                                Integer.parseInt(post.getFile()), post.isNotice());
            JOptionPane.showMessageDialog(this, "게시물 업데이트 완료!");
            boardMain.loadPosts(true);
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "게시물 업데이트 실패: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
