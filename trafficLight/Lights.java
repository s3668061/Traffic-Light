package trafficLight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Lights extends JPanel{
	
	public Lights() {
		setLayout(new GridLayout(3,1));
		Light red = new Light(Color.RED, Color.black);
		Light amber = new Light(Color.orange, Color.black);
		Light green= new Light(Color.green, Color.black);
		
		red.addMouseListener(new LightMouseListener(red));
		amber.addMouseListener(new LightMouseListener(amber));
		green.addMouseListener(new LightMouseListener(green));
	
		JToggleButton[] toggleButtons = new JToggleButton[3];
		toggleButtons[0] = red;
		toggleButtons[1] = amber;
		toggleButtons[2] = green;

		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(toggleButtons[0]);
		buttonGroup.add(toggleButtons[1]);
		buttonGroup.add(toggleButtons[2]);
		
		add(toggleButtons[0]);
		add(toggleButtons[1]);
		add(toggleButtons[2]);
	}
}

class LightMouseListener extends MouseAdapter{
	
	Light light;
	public LightMouseListener(Light red) {
		this.light = red;
	}
	
	public void mouseReleased(MouseEvent e){
		light.setLightColor(light.getColor());
	}
	
}
