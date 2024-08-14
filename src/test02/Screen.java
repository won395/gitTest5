package test02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Screen extends JPanel {
    private JLabel label;
    private JTextField Title;
    private JTextArea Contents;
    private JButton Save;
    private NoticeBoard noticeBoard;
    private Time time = new Time();
    private Error error = new Error();

    public Screen(NoticeBoard noticeBoard, String str) {
        this.noticeBoard = noticeBoard;
        this.setSize(500, 500);
        this.setLayout(null);
        this.setBackground(new Color(153, 204, 255));

        label = new JLabel(str);
        label.setBounds(20, 5, 450, 30);
        label.setForeground(new Color(000, 000, 102));
        label.setHorizontalAlignment(JLabel.CENTER);

        Title = new JTextField();
        Title.setBounds(20, 40, 450, 30);
        Title.setDocument(new JTextFieldLimit());

        Contents = new JTextArea();
        Contents.setBounds(20, 75, 450, 350);
        Contents.setLineWrap(true);
        JScrollPane sp = new JScrollPane(Contents);
        sp.setBounds(20, 75, 450, 350);

        Save = new JButton("Save");
        Save.setBounds(this.getWidth()/2 + 140, 435, 80, 20);

        add(label);
        add(Title);
        add(sp);
        add(Save);

        if (label.getText().equals("New Writing")) {
            Save.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (Title.getText().length() == 0 || Contents.getText().length() == 0) {
                        error.errorMessage();
                        return;
                    }

                    String format_time = time.FormatTime();

                    try {
                        NoticeDAO02 dao = new NoticeDAO02();
                        dao.addNotice(Title.getText(), Contents.getText());
                        InitialScreen is = new InitialScreen(noticeBoard);
                        noticeBoard.setContentPane(is);
                        noticeBoard.revalidate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }

        if (label.getText().equals("Modify")) {
            int selectedIndex = noticeBoard.TitleList.getSelectedIndex();
            try {
                NoticeDAO02 dao = new NoticeDAO02();
                Notice02 notice = dao.getNoticeById(selectedIndex + 1); // assuming id starts from 1
                Title.setText(notice.getTitle());
                Contents.setText(notice.getContent());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            Save.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (Title.getText().length() == 0 || Contents.getText().length() == 0) {
                        error.errorMessage();
                        return;
                    }

                    String format_time = time.FormatTime();

                    try {
                        NoticeDAO02 dao = new NoticeDAO02();
                        dao.updateNotice(selectedIndex + 1, Title.getText(), Contents.getText());
                        InitialScreen is = new InitialScreen(noticeBoard);
                        noticeBoard.setContentPane(is);
                        noticeBoard.revalidate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
    }

    private class Error {
        public void errorMessage() {
            JOptionPane.showMessageDialog(null, "제목과 내용을 입력하십시오", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Time {
        public String FormatTime() {
            java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.util.Calendar time = java.util.Calendar.getInstance();
            return format.format(time.getTime());
        }
    }
}
