package test02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class InitialScreen extends JPanel {
    private JButton WriteBtn, DeleteBtn, ModifyBtn;
    private NoticeBoard noticeBoard;

    public InitialScreen(NoticeBoard noticeBoard) {
        this.noticeBoard = noticeBoard;
        this.setSize(500, 500);
        this.setLayout(null);
        this.setBackground(new Color(153, 204, 255));

        JLabel label = new JLabel("게시판");
        label.setBounds(20, 20, 450, 50);
        label.setFont(new Font("Google Fonts", Font.PLAIN, 24));
        label.setForeground(new Color(000, 000, 102));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        noticeBoard.TitleList.setBounds(20, 70, 300, 345);
        noticeBoard.DateList.setBounds(320, 70, 150, 345);    
        noticeBoard.DateList.setEnabled(false);

        add(noticeBoard.TitleList); 
        add(noticeBoard.DateList);

        WriteBtn = new JButton("추가");
        WriteBtn.setBounds(240, 430, 75, 25);

        ModifyBtn = new JButton("수정");
        ModifyBtn.setBounds(320, 430, 75, 25);

        DeleteBtn = new JButton("삭제");
        DeleteBtn.setBounds(400, 430, 70, 25);

        add(WriteBtn); 
        add(ModifyBtn); 
        add(DeleteBtn);

        WriteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(noticeBoard.v1.size() == 17) {
                    JOptionPane.showMessageDialog(null, "더 이상 글을 쓸 수 없습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                Screen s = new Screen(noticeBoard, "새 게시물");
                noticeBoard.setContentPane(s);
            }
        });

        ModifyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(noticeBoard.TitleList.isSelectionEmpty() == false) {
                    noticeBoard.index = noticeBoard.TitleList.getSelectedIndex();
                    Screen s = new Screen(noticeBoard, "수정");
                    noticeBoard.setContentPane(s);
                }
            }
        });

        DeleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(noticeBoard.TitleList.isSelectionEmpty() == false) {
                    int choice = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "Delete", JOptionPane.OK_CANCEL_OPTION);
                    if(choice == JOptionPane.YES_OPTION) {
                        try {
                            NoticeDAO02 dao = new NoticeDAO02();
                            dao.deleteNotice(noticeBoard.TitleList.getSelectedIndex());
                            updateNoticeList();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    private void updateNoticeList() {
        try {
            NoticeDAO02 dao = new NoticeDAO02();
            List<Notice02> notices = dao.getAllNotices();
            DefaultListModel<String> titleModel = new DefaultListModel<>();
            DefaultListModel<String> dateModel = new DefaultListModel<>();
            for (Notice02 notice : notices) {
                titleModel.addElement(notice.getTitle());
                dateModel.addElement(notice.getDate().toString());
            }
            noticeBoard.TitleList.setModel(titleModel);
            noticeBoard.DateList.setModel(dateModel);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
