package frame.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutA extends JFrame{
	
	public CardLayoutA() {
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CardLayout cardlayout = new CardLayout();
		JPanel jpanel = new JPanel(cardlayout);
		
		//각 panel 생성
		JPanel card1 = new JPanel();
		card1.add(new Label("Card 1"));
		card1.setBackground(Color.CYAN);
		
		JPanel card2 = new JPanel();
		card2.add(new Label("Card 2"));
		card2.setBackground(Color.GREEN);
		
		JPanel card3 = new JPanel();
		card3.add(new Label("Card 3"));
		card3.setBackground(Color.MAGENTA);
		
		jpanel.add(card1,"1");
		jpanel.add(card2,"2");
		jpanel.add(card3,"3");
		
		JPanel controlPanel = new JPanel();
		JButton nextBtn = new JButton("NEXT");
		JButton prevBtn = new JButton("PREV");
		
		controlPanel.add(nextBtn);
		controlPanel.add(prevBtn);
		
		add(jpanel,BorderLayout.CENTER);
		add(controlPanel,BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		nextBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardlayout.next(jpanel);
			}
		});
		
		prevBtn.addActionListener(e ->{
			cardlayout.previous(jpanel);
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutA();
	}

}
