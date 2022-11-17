package come.on.SLIDERS;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class JSlider0001 extends JFrame implements ChangeListener{
            JPanel panel;
            JLabel label;
            JSlider slider;
            JSlider0001(){
            	
            	this.setTitle("Slider");
            	panel=new JPanel();
            	label=new JLabel();
            	
            	slider =new JSlider(0,500,50);
            	slider.setPreferredSize(new Dimension(400,200));
            	panel.add(slider);
            	panel.add(label);
            	this.add(panel);
            	
            	slider.setPaintTicks(true);
            	slider.setMinorTickSpacing(50);
            	
            	slider.setPaintTrack(true);
            	slider.setMajorTickSpacing(100);
            	slider.setPaintLabels(true);         // to show the labels
            	
            
            	slider.setFont(new Font("Consolas",Font.PLAIN,25));
            	slider.setOrientation(SwingConstants.VERTICAL);
          		slider.addChangeListener(this);
            	label.setText("°F = "+slider.getValue());
            	label.setFont(new Font("Consolas",Font.BOLD,50));
            	
            	
        		this.setSize(404,404);
        		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		//this.setLayout(new BorderLayout());
        		this.setVisible(true);
        	
        	    
            	
            }
            public void stateChanged(ChangeEvent e) {
            	label.setText("°F = "+slider.getValue());
            }
			
			
            
}
