package miniproject;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FishTank{  
	FishTank(){  
		
		   
		JFrame frame = new JFrame("Frame of Tank");
	    frame.setSize(500, 400);
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		    
		    
		    Button b1=new Button("display"); 
			Button b2=new Button("clear");
			b1.setBounds(30,40,70,30);
			b2.setBounds(100,210,70,30);
			
			Panel pane1=new Panel();
			pane1.setLayout(new GridBagLayout());
		
			 
		
			
			Panel pane2=new Panel();
			pane2.add(b1);
			pane2.add(b2);
			
			
			
			JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pane1,pane2);
			splitPane.setResizeWeight(1.0);
		
		    frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		
		}  
		public static void main(String args[]){  
		FishTank f=new FishTank();  
		}} 
