package come.on.JCheckBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class JCheckBox0001 extends JFrame implements ActionListener {
	     JButton button;
	     ImageIcon check=new ImageIcon("checkbox.png");
	     ImageIcon uncheck=new ImageIcon("remove.png");
	     JCheckBox box;
	     JCheckBox0001(){
	    	 this.setTitle("Oe Check Gar");
	    	 button =new JButton();
	    	 button.setText("Buja ya thichera");
	    	 button.addActionListener(this);
	    	 button.setFocusable(false);
	    	 box= new JCheckBox();
	    	 box.setText("KTA HOS ?");
	    	 box.setFocusable(false);
	    	 box.setIcon(uncheck);
	    	 box.setSelectedIcon(check);
	    	 
	    	 
	    	
	    	 this.setLayout(new FlowLayout());
	    	 this.add(box);
	    	 this.add(button);
	    	
	    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	 this.pack();
	    	 this.setVisible(true);
	     }
	     public void actionPerformed(ActionEvent f) {
	    	 if (f.getSource()==button) {
	    		 System.out.println(box.isSelected());
	    	 }
	     }

}
