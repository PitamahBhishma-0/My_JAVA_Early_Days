package come.on.panels;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JPlanel-----  Compenent to hold other components....
public class Panels10001 {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel redone=new JPanel();
		JLabel label=new JLabel();
		ImageIcon icon= new ImageIcon("hione.png");
		label.setIcon(icon);
		label.setText("oe fucche");
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setBounds(250, 0, 250, 250);
		label.setIconTextGap(5);
		redone.setBackground(Color.red);
		redone.setBounds(0, 0, 250, 250);
		redone.setLayout(null);
		JPanel blueone=new JPanel();
		blueone.setBackground(Color.blue);
		blueone.setBounds(250, 0, 250, 250);
		JPanel greenone=new JPanel();
		greenone.setBackground(Color.green);
		greenone.setBounds(0,250, 250, 250);
		greenone.setLayout(null);
		JPanel cyanone=new JPanel();
		cyanone.setBackground(Color.cyan);
		cyanone.setBounds(250,250, 250, 250);
		cyanone.setLayout(null);
		frame.setTitle("Paneeeeelllllllls");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(redone);
		frame.add(blueone);
		frame.add(greenone);
		frame.add(cyanone);
		blueone.add(label);
		
		
		
		
		
		
	}

}
