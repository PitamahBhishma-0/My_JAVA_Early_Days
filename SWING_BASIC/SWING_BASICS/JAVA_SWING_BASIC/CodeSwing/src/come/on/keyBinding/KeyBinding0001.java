package come.on.keyBinding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyBinding0001 {

	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	KeyBinding0001(){
	
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
	
		label.getInputMap().put(KeyStroke.getKeyStroke("W"), ("UpACtion"));
		label.getActionMap().put("UpACtion", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("S"), ("downaction"));
		label.getActionMap().put("downaction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("A"), ("leftaction"));
		label.getActionMap().put("leftaction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("D"), ("rightaction"));
		label.getActionMap().put("rightaction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
		   label.setLocation(label.getX(), label.getY()-10);
		}		
	}
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
		}		
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10, label.getY());
		}		
	}
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10, label.getY());
		}		
	}
}
