package test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class DatabaseFrame extends JFrame implements ActionListener, KeyListener {
    private JTextField inputName;
    private JTextField searchField;
    private DefaultListModel<String> model;
    private JList<String> jList;

    private DatabaseManager dbManager;

    public DatabaseFrame(DatabaseManager dbManager) {
        this.dbManager = dbManager;
        setSize(800, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("추가할 이름 입력");
        inputName = new JTextField(10);
        JButton addBtn = new JButton("추가");
        addBtn.setActionCommand("add");
        addBtn.addActionListener(this);

        JLabel searchLabel = new JLabel("게시글 검색");
        searchField = new JTextField(10);
        JButton searchBtn = new JButton("검색");
        searchBtn.setActionCommand("search");
        searchBtn.addActionListener(this);

        JPanel topPanel = new JPanel();
        topPanel.add(label);
        topPanel.add(inputName);
        topPanel.add(addBtn);
        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchBtn);

        add(topPanel, BorderLayout.NORTH);

        jList = new JList<>();
        model = new DefaultListModel<>();
        jList.setModel(model);
        JScrollPane sc = new JScrollPane(jList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(sc, BorderLayout.CENTER);

        inputName.addKeyListener(this);

        jList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = jList.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        String content = model.getElementAt(index);
                        // Here we assume the user is the author if the username is 'author'
                        boolean isAuthor = true; // This should be replaced with actual user verification logic
                        new EditPostFrame(dbManager, index + 1, content, isAuthor);
                    }
                }
            }
        });

        loadDataFromDatabase();

        setVisible(true);
    }

    private void loadDataFromDatabase() {
        ResultSet rs = dbManager.getData("SELECT content FROM posts");
        try {
            while (rs.next()) {
                String content = rs.getString("content");
                model.addElement(content);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addDataToDatabase(String content) {
        dbManager.addData("INSERT INTO posts (content) VALUES (?)", content);
    }

    private void searchDataFromDatabase(String keyword) {
        model.clear();
        ResultSet rs = dbManager.searchData("SELECT content FROM posts WHERE content LIKE ?", keyword);
        try {
            while (rs.next()) {
                String content = rs.getString("content");
                model.addElement(content);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("add")) {
            String name = inputName.getText();
            model.addElement(name);
            addDataToDatabase(name);
            inputName.setText("");
        } else if (command.equals("search")) {
            String keyword = searchField.getText();
            searchDataFromDatabase(keyword);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_ENTER) {
            String name = inputName.getText();
            model.addElement(name);
            addDataToDatabase(name);
            inputName.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
