package trafficLight;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Light extends JToggleButton{
	
	private Color color;
	private Color light;
	public Light(Color color, Color black) {
		this.color=black;
		this.light = color;
	}
	
	public void paint(Graphics g) {		
		g.setColor(color);
		g.fillOval(40, 40, 60, 60);		
	}

	public void setLightColor(Color color) {
		this.color = light;
		this.repaint();		
	}
	
	public void reColor(Graphics g) {
		g.setColor(color);

	}
	
	public Color getColor() {
		return color;
	}

}
