package come.on.JFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooser0001 extends JFrame implements ActionListener{
	  JButton button=new JButton("Select file");
	JFileChooser0001(){
		this.setTitle("FileChooser");
		this.setLayout(new FlowLayout());
		
		button.addActionListener(this);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent n) {
		if(n.getSource()==button) {
			JFileChooser filechooser=new JFileChooser();
			filechooser.setCurrentDirectory(new File("."));        // OPENS THE DEFAULT FILE LOCATOR
			
			
			//int response =filechooser.showOpenDialog(null);      // SELECT FILE TO OPEN
			int response =filechooser.showSaveDialog(null);        // SELECT FILE TO SAVE
			if(response==JFileChooser.APPROVE_OPTION) {
				File file =new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}
