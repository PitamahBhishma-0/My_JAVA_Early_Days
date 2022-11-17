package come.on.lables;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLable0000Main {

	public static void main(String[] args) {
		
		JFrame frame=new JFrame();
		frame.setTitle("Final one");
		JLabel label= new JLabel();
		ImageIcon image=new ImageIcon("nasa.jpeg");
		 Border border= BorderFactory.createLineBorder(Color.GREEN,3);
		
		label.setText("Hello Bro What are u doing?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.GREEN);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Mv Boli",Font.PLAIN,20));
		label.setIconTextGap(-5);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		//label.setBounds(25, 50, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(null);
		
		//frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	  

	}

}
