package frame.component;

import javax.swing.JFrame;

public class ChoiceA extends JFrame {
	
	public ChoiceA() {
		setSize(500, 500);
		setLocation(0, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//choice
		ChoiceA choiceA = new ChoiceA();
		choiceA.addItem("superman");
		choiceA.addItem("batman");
		choiceA.addItem("joker");
		choiceA.addItem("둘리");
		
		Font koreaFont = new
		
		add(choiceA);
		
		setVisible(true);
		
		choiceA.addActionListener(new
	}

	public static void main(String[] args) {
		

	}

}
