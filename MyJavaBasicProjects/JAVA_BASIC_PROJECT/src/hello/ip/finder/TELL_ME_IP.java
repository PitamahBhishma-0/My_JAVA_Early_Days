package hello.ip.finder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TELL_ME_IP extends JFrame implements ActionListener { 
	               ImageIcon image=new ImageIcon("nasa.jpeg");
	               ImageIcon image1= new ImageIcon("hione.png");
	              JLabel label;
	              JTextField text;
	              JButton button;
	              TELL_ME_IP(){
	            	  super("Hello I am Ip Finder");
	            	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            	  label=new JLabel("Enter the Address or URL");
	            	  label.setBounds(50, 70, 200, 20);
	            	  label.setBackground(Color.cyan);
	            	  label.setOpaque(true);
	            	  
	            	  text=new JTextField();
	            	  text.setBounds(50, 100, 250, 40);
	            	  text.setFont(new Font("MV Boli",Font.BOLD,25));
	            	  text.setBackground(Color.BLACK);
	            	  text.setForeground(Color.GREEN);
	            	  text.setCaretColor(Color.WHITE);
	            	  
	            	  button=new JButton("Click to find");
	            	  button.addActionListener(this);
	            	  button.setBounds(50,150,180,30);
	            	  button.setBackground(Color.RED);
	            	  button.setFocusable(false);
	            	  
	            	  add(label);
	            	  add(text);
	            	  add(button);
	            	  this.setIconImage(image.getImage());
	            	  this.getContentPane().setBackground(Color.LIGHT_GRAY);
	            	  setSize(500,500);
	            	  setResizable(false);
	            	  setLayout(null);
	            	  setVisible(true);            	  
	              }
	              
	                 
             public void actionPerformed(ActionEvent e) {
		              String url=
		             text.getText();
		              try {
		            	  InetAddress ia= InetAddress.getByName(url);
		            	  String ip=ia.getHostAddress();
		            	  JOptionPane.showMessageDialog(this, "Your provided host ip address is: "+ip, "Here You Have !!!", JOptionPane.PLAIN_MESSAGE, image1);
		              }
		              catch(UnknownHostException e1) {
		            	  JOptionPane.showMessageDialog(this,
		            			  "SORRY NO SUCH HOST FOUND", 
		            			  "PLEASE SEE THE DOMAIN NAME", 
		            			  JOptionPane.ERROR_MESSAGE, 
		            			  null);
		              }
            	
            	 
            	 
            	 
            	 
		
	             }


	          public static void main(String[] args) {
		                      new TELL_ME_IP();

	                              }

	
	
}
