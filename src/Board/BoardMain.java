package Board;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class BoardMain extends JFrame {
    private JList<String> TitleList = new JList<>();
    private JList<String> DateList = new JList<>();
    private DefaultListModel<String> TitleModel = new DefaultListModel<>();
    private DefaultListModel<String> DateModel = new DefaultListModel<>();
    private List<Post> posts = new ArrayList<>();
    private int index;

    public BoardMain() {
        this.setTitle("게시판");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,600);
        this.setLocationRelativeTo(getOwner());

        InitialScreen is = new InitialScreen();
        setContentPane(is);

        this.setResizable(false);
        this.setVisible(true);
    }

    public void loadPosts(boolean isNotice) {
        try {
            posts = Dataconn.getAllPosts();
            TitleModel.clear();
            DateModel.clear();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (Post post : posts) {
                if (post.isNotice() == isNotice) {
                    TitleModel.addElement(post.getTitle());
                    DateModel.addElement(sdf.format(post.getCreatedAt()));
                }
            }
            TitleList.setModel(TitleModel);
            DateList.setModel(DateModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private class InitialScreen extends JPanel {
        private JButton WriteBtn, DeleteBtn, NoticeBtn, InquiryBtn;

        public InitialScreen() {
            this.setSize(500, 500);
            this.setLayout(null);
            this.setBackground(new Color(0, 38, 66));

            JLabel label = new JLabel("게시판");
            label.setBounds(20, 10, 450, 50);
            label.setFont(new Font("GOOGLE FONTS", Font.BOLD, 36));
            label.setForeground(new Color(255, 255, 255));
            label.setHorizontalAlignment(JLabel.CENTER);
            add(label);

            TitleList.setBounds(20, 70, 300, 345);
            DateList.setBounds(320, 70, 150, 345);
            DateList.setEnabled(false);

            TitleList.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        index = TitleList.getSelectedIndex();
                        if (index != -1) {
                            PostEditFrame s = new PostEditFrame(posts.get(index), BoardMain.this);
                            s.setVisible(true);
                        }
                    }
                }
            });

            add(TitleList);
            add(DateList);

            WriteBtn = new JButton("작성");
            WriteBtn.setBounds(240, 430, 75, 25);
            DeleteBtn = new JButton("삭제");
            DeleteBtn.setBounds(320, 430, 75, 25);
            NoticeBtn = new JButton("게시물 보기");
            NoticeBtn.setBounds(100, 430, 100, 25);
            InquiryBtn = new JButton("문의사항 보기");
            InquiryBtn.setBounds(10, 430, 150, 25);

            add(WriteBtn);
            add(DeleteBtn);
            add(NoticeBtn);
            add(InquiryBtn);

            loadPosts(true); // 디폴트로 게시물 표시

            WriteBtn.addActionListener(e -> {
                if (TitleModel.size() == 17) {
                    JOptionPane.showMessageDialog(null, "더 이상 글을 쓸 수 없습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                PostEditFrame s = new PostEditFrame(BoardMain.this);
                s.setVisible(true);
            });

            DeleteBtn.addActionListener(e -> {
                if (!TitleList.isSelectionEmpty()) {
                    int choice = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "Delete", JOptionPane.OK_CANCEL_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        int selectedIndex = TitleList.getSelectedIndex();
                        try {
                            Dataconn.deletePost(posts.get(selectedIndex).getPostId());
                            posts.remove(selectedIndex);
                            TitleModel.remove(selectedIndex);
                            DateModel.remove(selectedIndex);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });

            NoticeBtn.addActionListener(e -> loadPosts(true)); // 게시물만 표시
            InquiryBtn.addActionListener(e -> loadPosts(false)); // 문의사항만 표시
        }
    }

    public static void main(String[] args) {
        new BoardMain();
    }
}
