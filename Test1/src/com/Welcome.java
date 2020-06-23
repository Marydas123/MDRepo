package com;

import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import test.Test23;

public class Welcome extends JFrame{
	static Test23 t= new Test23();
public static void main(String[]args) {
	
Welcome welcome = new Welcome();
welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
welcome.setSize(6, 3);
//welcome.add(t);

welcome.setVisible(true);
welcome.getContentPane().setBackground(Color.white);


}
private JLabel window1;
private JLabel window2;
private ImageIcon logo;
private ImageIcon Spinner;
public Welcome() {
    super ("HALTON'S PHARMACY");
   
   
   
    window2 = new JLabel(Spinner);
    Panel panel=new Panel();  
    panel.setBounds(40,80,200,200);    
    panel.setBackground(Color.gray);  
    Label l1;  
    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30); 
    
    ImageIcon img = null;
	try {
		img = new ImageIcon(ImageIO.read(new File("IMG_20171221_213548530.jpg"))
		        .getScaledInstance(230, 230, Image.SCALE_SMOOTH));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 BufferedImage image = null;
	try {
		image = ImageIO.read(new File("IMG_20171221_213548530.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JLabel label = new JLabel(new ImageIcon(image));
     panel.add(l1);  
    panel.add(label);
    
   // panel.add(t);
    window2.setIcon(img);
    window2.add(t);
    window2.add(l1);
    window2.add(panel);
    add(window2);
    validate();
}
}
