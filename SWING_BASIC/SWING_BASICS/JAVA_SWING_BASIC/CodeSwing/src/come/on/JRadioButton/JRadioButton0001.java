package come.on.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButton0001 extends JFrame implements ActionListener {
	JRadioButton male,female,others;
	ImageIcon maleico,femaleico,othersico;
	JRadioButton0001(){
		this.setTitle("Gender SELECTION");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		male=new JRadioButton("Male");
		female= new JRadioButton("Female");
		others= new JRadioButton("Others");
		
		ButtonGroup button=new ButtonGroup();
		button.add(male);
		button.add(female);
		button.add(others);
		
		maleico=new ImageIcon("C:\\Users\\gaura\\eclipse-workspace\\BroCodeSwing\\Artboard 1.png");
		femaleico=new ImageIcon("C:\\Users\\gaura\\eclipse-workspace\\BroCodeSwing\\Artboard 2.png");
		othersico=new ImageIcon("C:\\Users\\gaura\\eclipse-workspace\\BroCodeSwing\\Artboard 3.png");
		
		male.addActionListener(this);
		female.addActionListener(this);
		others.addActionListener(this);
		
		male.setIcon(maleico);
		female.setIcon(femaleico);
		others.setIcon(othersico);
		
		
		this.add(male);
		this.add(female);
		this.add(others);
		this.pack();
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent g) {
		if (g.getSource()==male) {
			System.out.println("You are male !!");
		}
		else if(g.getSource()==female) {
			System.out.println("You are female !!");
		}
		else if(g.getSource()==others)
			System.out.println("You are other than male and female !!");
		
	}

}
