package ex;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Adad1 extends JFrame {
	
	public Adad1() {
		setSize(500, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("슈퍼맨");
		listModel.addElement("슈퍼맨1");
		listModel.addElement("슈퍼맨2");
		listModel.addElement("슈퍼맨3");
		listModel.addElement("슈퍼맨4");
		listModel.addElement("슈퍼맨4");
		listModel.addElement("슈퍼맨5");
		
		JList<String> list = new JList<String>(listModel);
		//단일 선택
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// 스크롤 설정
		JScrollPane scrollpane = new JScrollPane(list);
		add(scrollpane, BorderLayout.CENTER);
		
		setVisible(true);
		
		//  리스트 선택 했을때
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(e.getValueIsAdjusting()) {
					String value = list.getSelectedValue();
					System.out.println("선택된것 확인"+ value);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Adad1();

	}

}

