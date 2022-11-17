package come.on.BorderLayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout0000 {

	public static void main(String[] args) {
		
		
//--------------------------------------Border places component in main 5 areas : EAST, WEST, SOUTH, NORTH & CENTER
		
		
		
		
		
		JFrame frame = new JFrame("HI BORDERS");
		ImageIcon image= new ImageIcon("shocked.png");
		JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		p9=new JPanel();
		p10=new JPanel();
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.green);
		p4.setBackground(Color.yellow);
		p5.setBackground(Color.PINK);
		p1.setPreferredSize(new Dimension(100,100));
		p2.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(100,100));
		p4.setPreferredSize(new Dimension(100,100));
		p5.setPreferredSize(new Dimension(100,100));
		//-------------------------------------SUB PANEL-------------------------------------//
		p5.setLayout(new BorderLayout(5,5));
		p6.setBackground(Color.black);
		p7.setBackground(Color.ORANGE);
		p8.setBackground(Color.CYAN);
		p9.setBackground(Color.gray);
		p10.setBackground(Color.MAGENTA);
		p6.setPreferredSize(new Dimension(50,50));
		p7.setPreferredSize(new Dimension(50,50));
		p8.setPreferredSize(new Dimension(50,50));
		p9.setPreferredSize(new Dimension(50,50));
		p10.setPreferredSize(new Dimension(50,50));
		p5.add(p6,BorderLayout.NORTH);
		p5.add(p7,BorderLayout.SOUTH);
		p5.add(p8,BorderLayout.EAST);
		p5.add(p9,BorderLayout.WEST);
		p5.add(p10,BorderLayout.CENTER);
				
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));                       // ADD MARGINSSSSSSSSSSSS
		frame.setVisible(true);
		frame.setIconImage(image.getImage());
		
		frame.add(p1,BorderLayout.NORTH);
		frame.add(p2,BorderLayout.SOUTH);
		frame.add(p3,BorderLayout.WEST);
		frame.add(p4,BorderLayout.EAST);
		frame.add(p5,BorderLayout.CENTER);
		

	}

}
