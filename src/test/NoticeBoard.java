package test;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
 
public class NoticeBoard extends JFrame {
    private JList<String> TitleList = new JList<String>();
    private JList<String> DateList = new JList<String>();
    private DefaultListModel<String> TitleModel = new DefaultListModel<String>();
    private DefaultListModel<String> DateModel = new DefaultListModel<String>();;
    private Vector<JTextField> v1 = new Vector<JTextField>();
    private Vector<JTextArea> v2 = new Vector<JTextArea>();
    private int index;
    
    public NoticeBoard() {
        this.setTitle("게시판");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        InitialScreen is = new InitialScreen();
        setContentPane(is);
                
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
    }
    
    private class InitialScreen extends JPanel {
        private JButton WriteBtn, DeleteBtn, ModifyBtn;
        
        public InitialScreen() {
            this.setSize(500, 500);
            this.setLayout(null);
            this.setBackground(new Color(153, 204, 255));
                
            JLabel label = new JLabel("게시판");
            label.setBounds(20, 20, 450, 50);
            label.setFont(new Font("Google Fonts", Font.PLAIN, 24));
            label.setForeground(new Color(000, 000, 102));
            label.setHorizontalAlignment(JLabel.CENTER);
            add(label);
            
            TitleList.setBounds(20, 70, 300, 345);
            
            DateList.setBounds(320, 70, 150, 345);    
            DateList.setEnabled(false);
            
            add(TitleList); add(DateList);
            
            WriteBtn = new JButton("추가");
            WriteBtn.setBounds(240, 430, 75, 25);
            
            ModifyBtn = new JButton("수정");
            ModifyBtn.setBounds(320, 430, 75, 25);
            
            DeleteBtn = new JButton("삭제");
            DeleteBtn.setBounds(400, 430, 70, 25);
            
            add(WriteBtn); add(ModifyBtn); add(DeleteBtn);
            
            WriteBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(v1.size() == 17) {
                        JOptionPane.showMessageDialog(null, "더 이상 글을 쓸 수 없습니다.", "Message",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    Screen s = new Screen("New Writing");
                    setContentPane(s);
                }
            });
            
            ModifyBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(TitleList.isSelectionEmpty() == false) {
                        index = TitleList.getSelectedIndex();
                        Screen s = new Screen("수정");
                        setContentPane(s);
                    }
                }
            });
            
            DeleteBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(TitleList.isSelectionEmpty() == false) {
                        int choice = JOptionPane.showConfirmDialog(null, "정말로 삭제하시겠습니까?", "Delete", JOptionPane.OK_CANCEL_OPTION);
                        if(choice == JOptionPane.YES_OPTION) {
                            v1.remove(TitleList.getSelectedIndex());
                            v2.remove(TitleList.getSelectedIndex());
                            
                            DateModel.remove(TitleList.getSelectedIndex());
                            DateList.setModel(DateModel);
                                
                            TitleModel.remove(TitleList.getSelectedIndex());
                            TitleList.setModel(TitleModel);
                        }
                        else {
                            return;
                        }
                    }
                }
            });
        }        
    }
 
    private class Screen extends JPanel {
        private JLabel label;
        private JTextField Title;
        private JTextArea Contents;
        private JButton Save;
        private time t = new time();
        private Error err = new Error();
        
        public Screen(String str) {
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
            
            add(label); add(Title); add(sp); add(Save);
            
            if(label.getText().equals("New Writing")) {
                Save.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(Title.getText().length() == 0 || Contents.getText().length() == 0) {
                            err.errorMessage();
                            return;
                        }
                        
                        String format_time = t.FormatTime();
                        
                        TitleModel.addElement(Title.getText());
                        TitleList.setModel(TitleModel);
                            
                        DateModel.addElement(format_time);
                        DateList.setModel(DateModel);
                            
                        v1.add(Title);
                        v2.add(Contents);
                        
                        InitialScreen is = new InitialScreen();
                        setContentPane(is);
                    }
                });
            }
            
            if(label.getText().equals("Modify")) {
                Title.setText(v1.get(index).getText());
                Contents.setText(v2.get(index).getText());
                
                Save.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(Title.getText().length() == 0 || Contents.getText().length() == 0) {
                            err.errorMessage();
                            return;
                        }
                        else {
                            String format_time = t.FormatTime();
                            
                            TitleModel.set(index, Title.getText());
                            TitleList.setModel(TitleModel);
                            
                            DateModel.set(index, format_time);
                            DateList.setModel(DateModel);
                            
                            v1.set(index, Title);
                            v2.set(index, Contents);
                            
                            InitialScreen is = new InitialScreen();
                            setContentPane(is);
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
        
        private class time {
            public String FormatTime() {
                SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
                Calendar time = Calendar.getInstance();
                String format_time = format.format(time.getTime());
                
                return format_time;
            }
        }
    }
    
    private class JTextFieldLimit extends PlainDocument {
        private int limit = 36;
        public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
            if(str == null) return;
            if(getLength() + str.length() <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }
 
    public static void main(String[] args) {
        new NoticeBoard();
    }
}