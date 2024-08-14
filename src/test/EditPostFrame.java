package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditPostFrame extends JFrame implements ActionListener {
    private JTextField contentField;
    private JButton saveButton;
    private JButton commentButton;
    private DatabaseManager dbManager;
    private int postId;
    private boolean isAuthor;

    public EditPostFrame(DatabaseManager dbManager, int postId, String content, boolean isAuthor) {
        this.dbManager = dbManager;
        this.postId = postId;
        this.isAuthor = isAuthor;

        setTitle("");
        setSize(400, 300);
        setLayout(new BorderLayout());

        contentField = new JTextField(content);
        add(contentField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        if (isAuthor) {
            saveButton = new JButton("저장");
            saveButton.addActionListener(this);
            buttonPanel.add(saveButton);
        } else {
            commentButton = new JButton("댓글 달기");
            commentButton.addActionListener(this);
            buttonPanel.add(commentButton);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            String updatedContent = contentField.getText();
            dbManager.updateData("UPDATE posts SET content = ? WHERE id = ?", updatedContent, postId);
            JOptionPane.showMessageDialog(this, "게시글이 수정되었습니다.");
            dispose();
        } else if (e.getSource() == commentButton) {
            String comment = contentField.getText();
            dbManager.addComment("INSERT INTO comments (comment, post_id) VALUES (?, ?)", comment, postId);
            JOptionPane.showMessageDialog(this, "댓글이 추가되었습니다.");
            dispose();
        }
    }
}

