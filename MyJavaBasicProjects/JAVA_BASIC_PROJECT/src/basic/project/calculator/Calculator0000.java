package basic.project.calculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculator0000 extends JFrame implements ActionListener {
                ImageIcon image=new ImageIcon("cal.png");
	            JButton[] key=new JButton[10];
	            JButton[] funKey=new JButton[9];
	            JTextField text=new JTextField();
	            JButton addButton,subButton,mulButton,divideButton;
	            JButton decButton,eqlButton,clrButton,delButton,negButton;
	            Font font= new Font("MV boli",Font.BOLD,25);
	            JPanel panel;
	            double num1=0,num2=0,res=0;
	            char operator;
	            
	           Calculator0000(){
	        	   
	        	   
	        	   this.setTitle("Our Calculator");
	        	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	   this.setSize(420, 600);
	        	   this.setLayout(null);
	        	   
	        	   text.setBounds(50, 25, 300, 40);
	        	   text.setFont(font);
	        	   text.setForeground(Color.GREEN);
	        	   text.setCaretColor(Color.PINK);
	        	   text.setBackground(Color.black);
	        	   text.setEditable(false);
	        	   
	        	   addButton=new JButton("+");
	        	   subButton=new JButton("-");
	        	   mulButton=new JButton("*");
	        	   divideButton=new JButton("/");
	        	   decButton=new JButton(".");
	        	   eqlButton=new JButton("=");
	        	   clrButton=new JButton("Clr");
	        	   delButton=new JButton("Del");
	        	   negButton=new JButton("(-)");
	        	   
	        	   funKey[0]=addButton;
	        	   funKey[1]=subButton;
	        	   funKey[2]=mulButton;
	        	   funKey[3]=divideButton;
	        	   funKey[4]=decButton;
	        	   funKey[5]=eqlButton;
	        	   funKey[6]=clrButton;
	        	   funKey[7]=delButton;
	        	   funKey[8]=negButton;
	        	   
//===================================== USIGN LOOP FOR FUNCTION KEY  ==============	        	   
	        	   for(int i=0;i<9;i++) {
	        		   funKey[i].addActionListener(this);
	        		   funKey[i].setFont(font);
	        		   funKey[i].setFocusable(false);
	        	   }
	        	   
//===================================== USIGN LOOP FOR Digit KEY  ==============	
	        	   for(int i=0;i<10;i++) {
	        		   key[i]=new JButton(String.valueOf(i));
	        		   key[i].addActionListener(this);
	        		   key[i].setFont(font);
	        		   key[i].setFocusable(false);
	        	   }
	        	   negButton.setBounds(50,430,100,50);
	        	   delButton.setBounds(150,430,100,50);
	        	   clrButton.setBounds(250, 430, 100, 50);
	        	   
	        	   panel =new JPanel();
	        	   panel.setBounds(50, 100, 300, 300);
	        	   panel.setLayout(new GridLayout(4,4,10,10));
	        	   panel.setBackground(Color.MAGENTA);
	        	   
	        	   panel.add(key[1]);
	        	   panel.add(key[2]);
	        	   panel.add(key[3]);
	        	   panel.add(addButton);
	        	   panel.add(key[4]);
	        	   panel.add(key[5]);
	        	   panel.add(key[6]);
	        	   panel.add(subButton);
	        	   panel.add(key[7]);
	        	   panel.add(key[8]);
	        	   panel.add(key[9]);
	        	   panel.add(mulButton);
	        	   panel.add(decButton);
	        	   panel.add(key[0]);
	        	   panel.add(eqlButton);
	        	   panel.add(divideButton);
	        	   
	        	   
	        	   
	        	   
	        	   this.add(negButton);
	        	   this.setIconImage(image.getImage());
	        	   this.add(panel);
	        	   this.add(delButton);
	        	   add(clrButton);
	        	   setResizable(false);
	        	   this.getContentPane().setBackground(Color.RED);
	        	   this.add(text);
	        	   this.setVisible(true);
	           }


	@Override
	public void actionPerformed(ActionEvent e) {
	            for(int i=0;i<10;i++) {
	            	if(e.getSource()==key[i]) {
	            		text.setText(text.getText().concat(String.valueOf(i)));
	            	}
	            }
	            if(e.getSource()==decButton) {
	            	text.setText(text.getText().concat("."));
	            }
	            if(e.getSource()==addButton) {
	            	num1=Double.parseDouble(text.getText());
	            	operator='+';
	            	text.setText("");
	            }
	            if(e.getSource()==subButton) {
	            	num1=Double.parseDouble(text.getText());
	            	operator='-';
	            	text.setText("");
	            }
	            if(e.getSource()==divideButton) {
	            	num1=Double.parseDouble(text.getText());
	            	operator='/';
	            	text.setText("");
	            }
	            if(e.getSource()==mulButton) {
	            	num1=Double.parseDouble(text.getText());
	            	operator='*';
	            	text.setText("");
	            }
	            if(e.getSource()==eqlButton) {
	            	
	            	num2=Double.parseDouble(text.getText());
	            	switch(operator) {
	            	case '+':
	            		res=num1+num2;
	            		break;
	            	case '-':
	            		res=num1-num2;
	            		break;
	            	case '*':
	            		res=num1*num2;
	            		break;
	            	case '/':
	            		res=num1/num2;
	            		break;
	            	}
	            	text.setText(String.valueOf(res));
	            	num1=res;
	            }
	            if(e.getSource()==clrButton) {
	            	text.setText("");
	            }
	            if(e.getSource()==delButton) {
	            	String number=text.getText();
	            	text.setText("");
	            	for(int i=0;i<number.length()-1;i++) {
	            		text.setText(text.getText()+number.charAt(i));
	            	}
	            }
	            
	            if(e.getSource()==negButton) {
	            	double tempo=Double.parseDouble(text.getText());
	            	tempo*=-1;
	            	text.setText(String.valueOf(tempo));
	            }
	            
		
		
		
	}
	
	
	
       public static void main(String[] args) {
		
    	   new Calculator0000();
    	   
    	   

	}

}
