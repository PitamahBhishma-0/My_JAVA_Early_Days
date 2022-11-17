package come.on.JComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox0001 extends JFrame implements ActionListener {
	
	JComboBox combo;
	JComboBox0001(){
		this.setTitle("JComboBox");
		this.setLayout(new FlowLayout());
		
//-----------------------MUST USE WRAPPER CLASS WHILE DEFINING ITEMS ------------------------		
		Integer number[]= {1,2,3};
		combo= new JComboBox(number);
		this.add(combo);
		combo.addActionListener(this);
		
		
//-----------------Bunch of other methods ---------------------------------
		
		
		
		
		
		//combo.setEditable(true);
		//combo.addItem("4");
		//combo.removeAllItems();
        //System.out.println(combo.getItemCount());		
		//combo.insertItemAt("0", 0);
		//combo.setSelectedIndex(0);
		//combo.removeItem(0);
		//combo.removeItemAt(0);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent gaurav) {
		if(gaurav.getSource()==combo) {
			System.out.println("YOU CHOOSED:"+""+combo.getSelectedItem());
//---------------   THIS METHOD GIVES AN INDEX OF THE CERTAIN ITEM     -------------------- 			
			//System.out.println("YOU CHOOSED:"+""+combo.getSelectedIndex());
		}
	}

}
