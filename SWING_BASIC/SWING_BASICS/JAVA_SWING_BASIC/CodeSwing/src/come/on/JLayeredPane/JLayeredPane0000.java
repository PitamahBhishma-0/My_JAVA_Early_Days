package come.on.JLayeredPane;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane0000 {

	public static void main(String[] args) {
		
		
		
		
//--------------- Swing Container that provides a 3rd dimension for positioning 
//		          component eg-depth, Z-index
		
		
		
		JFrame frame= new JFrame("JLayeredPane");
		JLabel label1=new JLabel();
		JLabel label2=new JLabel();
		JLabel label3=new JLabel();
		
		JLayeredPane layeredPane= new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		label1.setBounds(50, 50, 150, 150);
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label2.setBounds(100, 100, 150, 150);
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label3.setBounds(150, 150, 150, 150);
		label3.setBackground(Color.green);
		label3.setOpaque(true);
		
		
		
//--------------------------- WE CAN ASSIGN NUMBERS FOR DEPTH OR ASSIGN DIFFERENT LAYER METHOD------------------------------------
		
		
		
		layeredPane.add(label1,Integer.valueOf(2));
		layeredPane.add(label2,Integer.valueOf(0));
        layeredPane.add(label3,Integer.valueOf(1));
//		layeredPane.add(label3,JLayeredPane.POPUP_LAYER);-----------------------DEFINATION OF METHOD FOR DEPTH-------------------------
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(layeredPane);
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
		

	}

}
