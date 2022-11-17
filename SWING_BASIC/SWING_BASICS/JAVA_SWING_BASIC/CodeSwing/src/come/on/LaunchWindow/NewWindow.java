package come.on.LaunchWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame=new JFrame("HAHAHA AIIS NAYA WINDOW MA");
	JLabel label=new JLabel("OE BHAI K XA");
	NewWindow(){
		label.setBounds(50, 100, 150, 150);
		label.setFont(new Font(null,Font.BOLD,25));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    frame.setSize(500,500);
 	    frame.add(label);
 	    frame.setVisible(true);
 	    frame.setLayout(null);
	}

}
