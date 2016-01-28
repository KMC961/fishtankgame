package miniproject;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class FishTank extends JFrame{  
	FishTank(){  
		Button b1=new Button("display"); 
		Button b2=new Button("clear");
		b1.setBounds(10,210,70,30);
		b2.setBounds(100,210,70,30);
		add(b2);
		add(b1);
		setSize(300,300);
		setLayout(null); 
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}  
		public static void main(String args[]){  
		FishTank f=new FishTank();  
		}} 
