package test02;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class NoticeBoard extends JFrame {
    protected JList<String> TitleList = new JList<String>();
    protected JList<String> DateList = new JList<String>();
    protected DefaultListModel<String> TitleModel = new DefaultListModel<String>();
    protected DefaultListModel<String> DateModel = new DefaultListModel<String>();;
    protected Vector<JTextField> v1 = new Vector<JTextField>();
    protected Vector<JTextArea> v2 = new Vector<JTextArea>();
    protected int index;

    public NoticeBoard() {
        this.setTitle("게시판");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());

        InitialScreen is = new InitialScreen(this);
        setContentPane(is);

        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new NoticeBoard();
    }
}
