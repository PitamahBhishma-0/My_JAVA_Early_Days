package come.on.dragPanel;

import javax.swing.JFrame;

public class DragPanel0001 extends JFrame {
	DragPanel0002 drag=new DragPanel0002();
	DragPanel0001(){
		this.add(drag);
		this.setTitle("Drag and Drop");
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
