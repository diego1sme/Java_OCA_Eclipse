import java.awt.*;

public class Hyperbola{
  
  public static final int PANEL_SIZE = 512;
  
  public static void main(String [] args){
    System.out.println("Lab 4 by diego romero");
    DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
    Graphics g = panel.getGraphics();
    for(int i = 0; i <= PANEL_SIZE; i +=32)
    g.drawLine(0, i, i, PANEL_SIZE);
    for(int i = PANEL_SIZE; i >= 0; i-= 8)
    g.drawLine(PANEL_SIZE,i , i, 0);
    
  }
}