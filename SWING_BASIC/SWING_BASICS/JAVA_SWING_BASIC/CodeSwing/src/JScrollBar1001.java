

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class JScrollBar1001 {
	JScrollBar1001(){
		JFrame f=new JFrame();
		JScrollBar s=new JScrollBar();
		s.setBounds(100, 100, 50, 100);
		f.add(s);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
         
	public static void main(String[] args) {
		new JScrollBar1001();
	}

}
