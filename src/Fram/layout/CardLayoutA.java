package Fram.layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CardLayoutA extends JFrame {
	
	public CardLayoutA() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CardLayout cardLayout = new CardLayout();
		JPanel jPanel = new JPanel(cardLayout);
		
		// 각 패널 생성
		JPanel card1 = new JPanel();
		card1.add(new Label("Card 1"));
		card1.setBackground(Color.cyan);
		
		JPanel card2 = new JPanel();
		card2.add(new Label("Card 2"));
		card2.setBackground(Color.green);
		
		JPanel card3 = new JPanel();
		card3.add(new Label("Card 3"));
		card3.setBackground(Color.magenta);
		
		jPanel.add(card1, "1");
		jPanel.add(card2, "2");
		jPanel.add(card3, "3");
		
		//기능에 대한 버튼
		JPanel controlPanel = new JPanel();
		JButton nextBtn = new JButton("NEXT");
		JButton prevBtn = new JButton("PREV");
		
		
		add(jPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		nextBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.next(jPanel);
			}
		});
		
		prevBtn.addActionListener(e -> {cardLayout.previous(jPanel);});
	}

	public static void main(String[] args) {
		new CardLayoutA();

	}

}