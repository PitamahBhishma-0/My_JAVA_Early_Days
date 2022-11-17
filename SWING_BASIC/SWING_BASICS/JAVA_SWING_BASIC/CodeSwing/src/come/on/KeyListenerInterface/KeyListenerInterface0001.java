package come.on.KeyListenerInterface;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerInterface0001 extends JFrame implements KeyListener{
	
	
	JLabel label;
	ImageIcon image;
	KeyListenerInterface0001(){
		this.setTitle("KeyListener-Interface");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image=new ImageIcon("hione.png");
		label=new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setText("ROTATE");
		
		label.setIcon(image);
		//label.setOpaque(true);
		this.add(label);
		this.setSize(400, 400);
		this.addKeyListener(this);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		this.setVisible(true);
	}
	public void keyTyped(KeyEvent o) {
//================================ INVOKES WHEN KEY-TYPED. USES KEY CHAR "char" as OUTPUT ==============================		
		switch(o.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX() ,label.getY()-10);
			break;
		case 's':
			label.setLocation(label.getX(), label.getY()+10);
			break;
		case'd':
			label.setLocation(label.getX()+10, label.getY());
			break;
		}
		
		
		
		
	}
	public void keyPressed(KeyEvent o) {
//================================= INVOKES WHEN PHYSICAL KEY-PRESSED. USES KEY CODE "int" as output =================
		
		switch(o.getKeyCode()) {
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;
		case 39:
			label.setLocation(label.getX()+10,label.getY());
			break;
		}
		
		
		
		
	}
	public void keyReleased(KeyEvent o) {
//==================================== INVOKES WHEN KEY IS RELEASED =============================================		
		//System.out.println("YOU PRESSED :"+o.getKeyChar());
		System.out.println("You pressed :"+o.getKeyCode());
		
		
		
	}
}
