package come.on.dragPanel;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel0002 extends JPanel {
	ImageIcon image= new ImageIcon("cool.png");
	
	final int Width=image.getIconWidth();
	final int Height=image.getIconHeight();
	Point imagecorner;
	Point previousPoint;
	DragPanel0002(){
		imagecorner =new Point(0,0);
		Click click= new Click();
		drag Drag =new drag();
		this.addMouseListener(click);
		this.addMouseMotionListener(Drag);
		
	}
	
	public void paintComponent(Graphics e) {
		super.paintComponent(e);
		image.paintIcon(this, e,(int) imagecorner.getX(),(int) imagecorner.getY());
	}
	
	private class Click extends MouseAdapter {
		public void  mousePressed(MouseEvent e) {
			previousPoint=e.getPoint();
		}
	}
	private class drag extends MouseMotionAdapter {
	 public void mouseDragged(MouseEvent e) {
		  Point currentPoint=e.getPoint();
		  imagecorner.translate(
				  (int)(currentPoint.getX()-previousPoint.getX())
				  
				  , (int) (currentPoint.getY()-previousPoint.getY()));
		  previousPoint=currentPoint;
		  repaint();
	  }
	}
}
