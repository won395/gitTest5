package test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Test04 extends JFrame implements ActionListener, KeyListener {
    private JTextField inputName;
    private DefaultListModel<String> model;
    private JList<String> jList;

    public Test04() {
        setSize(500, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("제목");
        inputName = new JTextField(10);
        JButton addBtn = new JButton("추가");
        addBtn.setActionCommand("add");
        addBtn.addActionListener(this);
        //JButton deleteBtn = new JButton("삭제");
        //deleteBtn.setActionCommand("delete");
        //deleteBtn.addActionListener(this);

        JPanel topPanel = new JPanel();
        topPanel.add(label);
        topPanel.add(inputName);
        topPanel.add(addBtn);
        //topPanel.add(deleteBtn);

        add(topPanel, BorderLayout.NORTH);

        jList = new JList<>();
        model = new DefaultListModel<>();
        model.addElement("공지");
        model.addElement("집가고싶어");
        jList.setModel(model);

        JScrollPane sc = new JScrollPane(jList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(sc, BorderLayout.CENTER);

        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = jList.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        String selectedItem = model.get(index);
                        new DetailFrame(selectedItem).setVisible(true);
                    }
                }
            }
        });

        inputName.addKeyListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test04();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("add")) {
            String name = inputName.getText();
            model.addElement(name);
            inputName.setText("");
        } else if (command.equals("delete")) {
            int index = jList.getSelectedIndex();
            if (index >= 0) {
                model.remove(index);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_ENTER) {
            String name = inputName.getText();
            model.addElement(name);
            inputName.setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    private class DetailFrame extends JFrame implements ActionListener {
        private JTextField titleField;
        private JTextArea contentArea;
        private JLabel imageLabel;
        private JFileChooser fileChooser;
        private String imagePath;

        public DetailFrame(String title) {
            setTitle(title);
            setSize(400, 400);
            setLocation(200, 200);
            setLayout(new BorderLayout());
            
            

            titleField = new JTextField(title, 20);
            contentArea = new JTextArea(10, 20);
            imageLabel = new JLabel();
            fileChooser = new JFileChooser();

            JButton loadImageBtn = new JButton("이미지 불러오기");
            loadImageBtn.setActionCommand("loadImage");
            loadImageBtn.addActionListener(this);

            JButton saveBtn = new JButton("저장");
            saveBtn.setActionCommand("저장");
            saveBtn.addActionListener(this);

            JButton deleteBtn = new JButton("삭제");
            deleteBtn.setActionCommand("삭제");
            deleteBtn.addActionListener(this);

            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new FlowLayout());
            inputPanel.add(new JLabel("제목"));
            inputPanel.add(titleField);
            inputPanel.add(new JLabel("내용"));
            inputPanel.add(new JScrollPane(contentArea));
            inputPanel.add(loadImageBtn);
            inputPanel.add(saveBtn);
            inputPanel.add(deleteBtn);

            add(inputPanel, BorderLayout.CENTER);
            add(imageLabel, BorderLayout.SOUTH);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("loadImage")) {
                int returnValue = fileChooser.showOpenDialog(this);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    imagePath = selectedFile.getPath();
                    imageLabel.setIcon(new ImageIcon(imagePath));
                }
            } else if (command.equals("저장")) {
                String title = titleField.getText();
                String content = contentArea.getText();
                // 저장 로직 추가
                JOptionPane.showMessageDialog(this, "저장되었습니다.");
            } else if (command.equals("삭제")) {
                // 삭제 로직 추가
                JOptionPane.showMessageDialog(this, "삭제되었습니다.");
            }
        }
    }
}
