package come.on.MenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar0001 extends JFrame implements ActionListener {
	JMenuBar barMenu=new JMenuBar();
	JMenu menuFile=new JMenu("File");
	JMenu menuEdit=new JMenu("Edit");
	JMenu menuHelp=new JMenu("Help");
	JMenuItem itemNew=new JMenuItem("New");
	JMenuItem itemSave=new JMenuItem("Save");
	JMenuItem itemExit=new JMenuItem("Exit");
	
	MenuBar0001(){
		this.setTitle("MenuBar");
		this.setJMenuBar(barMenu);
		
		
		barMenu.add(menuFile);
		barMenu.add(menuEdit);
		barMenu.add(menuHelp);
		
		menuFile.add(itemNew);
		menuFile.add(itemSave);
		menuFile.add(itemExit);
		
		itemSave.addActionListener(this);
		itemExit.addActionListener(this);
		itemNew.addActionListener(this);
		
		
		
		menuFile.setMnemonic(KeyEvent.VK_F);   //   OPENS FILE TAB WITH ALT+F
		menuEdit.setMnemonic(KeyEvent.VK_E);   //   OPENS Edit TAB WITH ALT+E
		menuHelp.setMnemonic(KeyEvent.VK_H);   //   OPENS Help TAB WITH ALT+H
		itemSave.setMnemonic(KeyEvent.VK_S);   //   OPENS  SAVE TAB WITH S
		itemExit.setMnemonic(KeyEvent.VK_E);   //   Performs Exit TAB WITH E
		itemNew.setMnemonic(KeyEvent.VK_N);     //OPENS New TAB WITH N
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent p) {
		if (p.getSource()==itemNew) {
			System.out.println("You opened a new file :::::");
		}
		 if(p.getSource()==itemSave) {
			System.out.println("You opened save file ......");
		}
		 if(p.getSource()==itemExit) {
			 System.out.println("YOU EXITED ;;;");
			 System.exit(0);
		}
	}

	

}
