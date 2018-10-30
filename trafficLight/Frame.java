package trafficLight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	
    public Frame(){
    	setLayout(new BorderLayout());
        add(new Lights(), BorderLayout.CENTER);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setLocationRelativeTo(null);
        setVisible(true);
   }

   //public void paint(Graphics g){
     //  g.setColor(Color.red);
      // g.fillOval(40, 40, 60, 60); //FOR CIRCLE
   //}

}
