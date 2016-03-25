import java.awt.*;

public class logo{
  
  public static void main(String [] args){
    DrawingPanel panel = new DrawingPanel(500,500);
    Graphics g = panel.getGraphics();
    g.setColor(Color.black);
    g.fillRect(0,0,500,500);
    startLogo(g, panel);
  }
  public static void startLogo(Graphics g, DrawingPanel panel){
    while(true){
      outerCircles(g, panel);
      panel.sleep(5000);
    }
  }
    public static void outerCircles(Graphics g, DrawingPanel panel){
      g.setColor(Color.orange);
      g.fillOval(50,50,375,375);
      g.setColor(Color.black);
      g.fillOval(75,75,330,330);
    }  
}
  
  