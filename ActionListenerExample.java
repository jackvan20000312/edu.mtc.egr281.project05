package projects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionListenerExample {  
	public static void main(String[] args) {  
	    //GUI Name
		JFrame f=new JFrame("Button Example");  
	    //GUI BOX SIZE
  
 
		//GUI text field
		final JTextField tf=new JTextField();  
	    //text field location and size
		tf.setBounds(50,50, 150,20);  
	    //Button Text
	    JButton b=new JButton("Christmas");  
	    //button location and Size
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	    //does this if button is pressed        
		tf.setText("You have Started Christmas FUN!.");  
	        }  
	    });  
	    f.add(b);f.add(tf);
	    f.setSize(200,200);  
	    f.setLayout(null);  
	    f.setVisible(true);
	}  
	}  