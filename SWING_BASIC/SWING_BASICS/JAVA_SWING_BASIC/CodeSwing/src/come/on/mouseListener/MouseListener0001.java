package come.on.mouseListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListener0001 extends JFrame implements MouseListener{
	       JLabel label=new JLabel();
	       ImageIcon shocked,ArtBoard1,ArtBoard2,ArtBoard3,nasa;
	MouseListener0001(){
		this.setTitle("MOUSE-LISTENER");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		label.addMouseListener(this);
		/*label.setBounds(0, 0, 500, 500);
		label.setBackground(Color.MAGENTA);
		label.setOpaque(true);
		
		*/
		this.setLayout(new FlowLayout());
		shocked=new ImageIcon("shocked.png");
		label.setIcon(shocked);
		this.add(label);
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
	}
	

	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You clicked the mouse");
		//label.setBackground(Color.PINK);
		ArtBoard1=new ImageIcon("Artboard 1.png");
		label.setIcon(ArtBoard1);
		
		
	}


	public void mousePressed(MouseEvent e) {
// ===================================== HOLDING THE MOUSEEE =======================
		
		
		
		
		System.out.println("You HOLDED the mouse");
		//label.setBackground(Color.CYAN);
		ArtBoard2=new ImageIcon("Artboard 2.png");
		label.setIcon(ArtBoard2);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released mouse");
		//label.setBackground(Color.orange);
		ArtBoard3=new ImageIcon("Artboard 3.png");
		label.setIcon(ArtBoard3);
		
	}

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You entered the area");
		//label.setBackground(Color.YELLOW);
		nasa=new ImageIcon("nasa.jpeg");
		label.setIcon(nasa);
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You exited the component");
		//label.setBackground(Color.MAGENTA);
		label.setIcon(shocked);
		this.add(label);
	}

}
