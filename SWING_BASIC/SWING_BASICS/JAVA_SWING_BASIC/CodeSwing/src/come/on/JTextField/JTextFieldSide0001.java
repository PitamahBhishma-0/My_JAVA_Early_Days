package come.on.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextFieldSide0001 extends JFrame implements ActionListener{
        
          JTextField text= new JTextField();
          JButton button=new JButton("Submit");
          JTextFieldSide0001(){
        	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	  text.getText();
        	  text.setBackground(Color.BLACK);
        	  text.setFont(new Font("Consolas",Font.BOLD,25 ));
        	  text.setForeground(Color.GREEN);
        	  button.addActionListener(this);
        	  text.setPreferredSize(new Dimension(200,40));
        	  this.setLayout(new FlowLayout());
        	  text.setText("k xa?");
        	  text.setCaretColor(Color.BLUE);
        	  this.setVisible(true);
        	  this.add(button);
        	  this.add(text);
        	  this.pack(); 
        	  
          }
          public void actionPerformed(ActionEvent e) {
        	  if (e.getSource()==button) {
        		  System.out.println("WELCOME :"+text.getText());
        		  text.setEditable(false);
        		  button.setEnabled(false);
        	  }
       }
}
        	  

          
          

