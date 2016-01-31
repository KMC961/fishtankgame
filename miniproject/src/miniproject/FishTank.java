package miniproject;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class FishTank{  
	FishTank(){  
		
		 Panel pane1=new Panel(new GridLayout(4,6));
		 for (int i =0; i<(4*6); i++)
		  { 	
			   ImageIcon imageIcon = new ImageIcon("blue-green-nature-water-waterfalls-Favim.com-185739.jpg");
	    	   JLabel label = new JLabel(imageIcon);
	    	   label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    	   pane1.add(label);
			 
		  } 
			 
		    Button b1=new Button("display");
		    b1.addActionListener(new ActionListener() {
		    	 
	            public void actionPerformed(ActionEvent e)
	            {
	              pane1.removeAll(); 	
	              for (int i =0; i<(4*6); i++)
	            	{	
	            	if(i==2|i==6|i==9|i==11|i==13|i==23)
			    	  {
			    	   ImageIcon imageIcon = new ImageIcon("happy-fish-dream-aquarium-android-icon.png");
			    	   JLabel label_if = new JLabel(imageIcon);
			    	   label_if.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			    	   pane1.add(label_if);
			    	  }
			    	  
			    	else
			    	  {	
			    		ImageIcon imageIcon = new ImageIcon("blue-green-nature-water-waterfalls-Favim.com-185739.jpg");
				        JLabel label_else = new JLabel(imageIcon);  
			    	    label_else.setVisible(true);
			    	    label_else.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			            pane1.add(label_else);
			    	  } 
			      }
	            	
	            	
	            	
	                System.out.println("You clicked the button");
	            }
	        });      
			
		    Button b2=new Button("clear");
		    b2.addActionListener(new ActionListener() {
		    	 
	            public void actionPerformed(ActionEvent e)
	            {
	            	pane1.removeAll();
	            	 for (int i =0; i<(4*6); i++)
	       		    { 	
	       			   ImageIcon imageIcon = new ImageIcon("blue-green-nature-water-waterfalls-Favim.com-185739.jpg");
	       	    	   JLabel label = new JLabel(imageIcon);
	       	    	   label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	       	    	   pane1.add(label);
	       			 
	       		  }
	                System.out.println("You clicked the clear button");
	            }
	        }); 
		    
		    
		    
			b1.setBounds(30,40,70,30);
			b2.setBounds(100,210,70,30);
			
			Panel pane2=new Panel();
			pane2.add(b1);
			pane2.add(b2);
			
			
			
			JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pane1,pane2);
			splitPane.setResizeWeight(1.0);
			
			
			JFrame frame = new JFrame("Frame of Tank");
		    frame.setSize(570,500);
           // frame.setResizable(false);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		    frame.getContentPane().add(splitPane, BorderLayout.CENTER);
	
		
		}  
		public static void main(String args[]){  
		    FishTank f=new FishTank();
	
		      }
		 } 
