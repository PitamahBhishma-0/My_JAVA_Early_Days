package come.on.FlowLayoutManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutManager0000 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Flow Layout Manager");
		JPanel panel=new JPanel();
		ImageIcon image=new ImageIcon("small.png");
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		frame.setIconImage(image.getImage());
		panel.setLayout(new FlowLayout());
		panel.setPreferredSize(new Dimension(150,200));
		panel.setBackground(Color.gray);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.add(panel);
		

	}

}
