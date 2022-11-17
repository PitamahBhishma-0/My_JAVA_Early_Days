package come.on.JColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JColorChooser0001 extends JFrame implements ActionListener{
               JButton button; JLabel label;
               JColorChooser0001(){
            	this.setTitle("JColor-Chooser");
            	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	
            	
            	button =new JButton("Hello!!! choose the fucking color");
            	label=new JLabel();
            	label.setText("Here is the output :D");
            	label.setBackground(Color.white);
            	label.setFont(new Font("MV boli",Font.PLAIN,100));
            	label.setOpaque(true);
            	button.addActionListener(this);
           		this.add(button);
           		this.add(label);
           		this.setLayout(new FlowLayout());
           		this.setVisible(true);
           		this.pack();
               }
          public void actionPerformed(ActionEvent r) {
        	  if(r.getSource()==button) {
        		  JColorChooser chooser=new JColorChooser();
        		  Color bunchOfColor=JColorChooser.showDialog(null, "Here are your color, ENJOY!!!", Color.BLACK);
        		 
        		  label.setForeground(bunchOfColor);
        		 
        		 
        	  }
          }
}
