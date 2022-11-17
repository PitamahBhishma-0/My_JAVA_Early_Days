package come.on.bro;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JFRAME0001 extends JFrame {
               
	JFRAME0001(){
		
		this.setTitle("Final one");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);
		this.setVisible(true);
		ImageIcon image=new ImageIcon("logo.png");
	    this.setIconImage(image.getImage());
	    this.getContentPane().setBackground(new Color (255,56,89));
	}
	

}
