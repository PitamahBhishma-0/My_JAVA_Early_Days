package come.on.button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonSIDE extends JFrame implements ActionListener  {
        
	JButton button;
	JLabel label;
	ButtonSIDE(){	
		ImageIcon icon=new ImageIcon("hione.png");
		ImageIcon icon1= new ImageIcon("cool.png");
		label =new JLabel();
		label.setIcon(icon1);
		label.setBounds(200,200,500,500);
		label.setVisible(false);
		button =new JButton("thich ya");
		button.setBounds(200, 100, 200, 100);
		button.setIcon(icon);
		//button.setText("Hello");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font ("Consolas",Font.BOLD,25));
		button.setBackground(Color.GRAY);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		
		button.addActionListener(this);
		
		/*             LAMBDA EXPRESSION 
		 * 
		 *     No need of actin listener component while using this 
		 * 
		 * 
		button.addActionListener(e -> System.out.println("hijijiji"));
		*
		*
		*
		*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(500,500);
		this.add(button);
		this.add(label);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("Cool");
			//button.setEnabled(false);// enables button only once
			label.setVisible(true);
		}
	}
	
}
