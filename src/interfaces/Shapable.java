package interfaces;

import java.awt.Color;
import java.awt.Graphics;

public interface Shapable {
	
	public void setXCo(double newXCo);
	public double getXCo();
	public void setYCo(double newYCo);
	public double getYCo();
	public void incrementXCo(double index);
	public void incrementYCo(double index);
	
	public void setXVel(double newXVel);
	public double getXVel();
	public void setYVel(double newYVel);
	public double getYVel();
	public void incrementXVel(double index);
	public void incrementYVel(double index);
	
	public void setColor();
	public Color getColor();
	public void setFill(boolean newFill);
	public boolean getFill();
	
	public void draw(Graphics g);
}
