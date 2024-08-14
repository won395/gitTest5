package test02;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
import javax.swing.ProgressMonitorInputStream;

import javax.swing.border.TitledBorder;

 

public class ProgressBar extends JFrame implements
  ActionListener, Runnable {

 private JTextArea jta = new JTextArea();
 private JScrollPane jsp = new JScrollPane(jta);
 private JButton jbt = new JButton("로딩");
 private JFileChooser jfc = new JFileChooser();
 private File file;
 private ProgressMonitorInputStream pmi;

 public ProgressBar() {
  setForm();
  setSize(300, 200);
  Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
  setLocation(d.width / 2 - 150, d.height / 2 - 100);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

 public void setForm() {
  jta.setBorder(new TitledBorder("Loding..."));
  add("Center", jsp);
  JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
  jp.add(jbt);
  add("South", jp);
  jbt.addActionListener(this);
 }

  
 @Override
 public void run() {
  ProgressMonitor pm = pmi.getProgressMonitor();
  pm.setNote("Started");
  jta.setText("");
  int imsi = 0;
  int kk = 0;
  long size = file.length();
  jta.setCursor(new Cursor(Cursor.WAIT_CURSOR));
  try {
   while ((imsi = pmi.read()) != -1) {
    pm.setNote((int) (kk / (float) size * 100) + "%");
    pm.setProgress(kk++);
    jta.append("" + (char) imsi);
    jta.setCaretPosition(jta.getText().length());// 커서 위치값을 마지막으로
    try {// 읽는게 너무빠르기에 조금 느리게 해주려고 일부러 넣음
     Thread.sleep(20);
    } catch (InterruptedException e) {
     e.printStackTrace();
    }
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
  pm.close();
  jta.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  if (e.getSource() == jbt) {
   jfc.showOpenDialog(this);
   file = jfc.getSelectedFile();
   if (file == null)
    return;// 취소누르면 null
   try {
    pmi = new ProgressMonitorInputStream(this, "Loading"
      + file.getName() + "...", new FileInputStream(file));
   } catch (IOException e2) {
    e2.printStackTrace();
   }
   
   new Thread(this).start();

  }
 }

 public static void main(String[] args) {
  new ProgressBar();
 	}
}