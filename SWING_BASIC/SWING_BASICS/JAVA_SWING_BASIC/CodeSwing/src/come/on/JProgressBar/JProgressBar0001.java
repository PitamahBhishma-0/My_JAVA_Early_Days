package come.on.JProgressBar;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBar0001 extends JFrame{
            JProgressBar bar;
            JProgressBar0001(){
            	this.setTitle("JProgress");
        		
        		
        		
        		bar=new JProgressBar();
        		bar.setValue(0);
        		bar.setBounds(0, 100, 400, 40);
        		bar.setStringPainted(true);
        		bar.setFont(new Font("Consolas",Font.BOLD,25));
        		bar.setForeground(Color.MAGENTA);
        		bar.setBackground(Color.BLACK);
        		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		this.setSize(400, 400);
        		this.add(bar);
        		this.setLayout(null);
        		this.setVisible(true);
        		fill();	
            }
            public void fill() {
            	int count=0;
            	while(count<=100) {
            		bar.setValue(count);
            		try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		count +=1;
            	}
            	bar.setString("BHAYO  BHAYO");
            	
            }
}
