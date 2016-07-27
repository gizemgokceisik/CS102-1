/*
 * @Author: Ege Darcin
 * 24.03.2016
 * Lab04b
 * Version 1.1
 */
import java.awt.Graphics;
import shapes.Circle;
import shapes.Drawable;
import java.awt.Color;

public class Balloon extends Circle implements Drawable {
  //variables
  static final int DEFAULT_SIZE = 25;
  static final int SIZE_INCREMENT = 1;
  static final int MAX_SIZE = 100;
  
  //balloon creater
  public Balloon(int x, int y) {
    super(25);
    this.setLocation(x, y);
  }
  
  //balloon drawer, with random color
  @Override
  public void draw(Graphics g) {
    int R = (int) (Math.random( )*256);
    int G = (int)(Math.random( )*256);
    int B= (int)(Math.random( )*256);
    Color randomColor = new Color(R, G, B);
    g.setColor(randomColor);
    int radius = this.getRadius();
    g.fillOval(this.getX() - radius, this.getY() - radius, radius * 2, radius * 2);
  }
  
  //balloon popper
  public void burst() {
    this.setRadius(0);
    this.setSelected(true);
  }
  
  //balloon grower
  public boolean grow() {
    this.setRadius(this.getRadius() + 1);
    if (this.getRadius() > 100) {
      this.burst();
    }
    return this.getRadius() != 0;
  }
  
  
}

