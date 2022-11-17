package come.on.LaunchWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	               JFrame frame=new JFrame("K XA MERO BHAI");
	               JButton Button7=new JButton("NAYA WINDOW KHOL");
               LaunchPage(){
            	   Button7.setBounds(100, 160, 200, 40);
            	   Button7.setFocusable(false);
            	   Button7.addActionListener(this);
            	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	   frame.add(Button7);
            	   frame.setSize(500,500);
            	   frame.setLayout(null);
            	   frame.setVisible(true);
            	   
            	   
            	   
            	 
               }
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==Button7) {
					frame.dispose();
					NewWindow window=new NewWindow();
				}
				
			}
			
}
