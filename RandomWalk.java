import java.util.*;
import java.awt.*;
public class RandomWalk{
  
  public static final Scanner console = new Scanner(System.in);
  
  public static void main(String [] args){
    System.out.println("Lab 7 by Diego Romero");
    Random rand = new Random();
    boolean cont = true;
    
    
    System.out.println("Enter the radius of a circle from 50 to 400");
    int rad = console.nextInt();
    Color color = Color.WHITE;
    while(!(rad >= 50 && rad <=400)){
      System.out.println("Enter another radius");
      rad = console.nextInt();
    }
    while(cont) {
      String colorStr = promptString("Please enter the color of the circle (green [g] or blue [b]): ");
      if(matchesChoice(colorStr, "green")) {
        color = Color.GREEN;
        cont = false;
      }
      else if(matchesChoice(colorStr, "blue")) {
        color = Color.BLUE;
        cont = false;
      }
      else {
        System.err.println("ERROR: \"" + colorStr + 
                           "\" is an invalid choice. Please enter \"green\", \"blue\", \"g\", or \"b\" (Not case-sensitive).");
      }
    }    
    DrawingPanel panel = new DrawingPanel(rad * 2 + 32, rad * 2 + 32);
    Graphics g = panel.getGraphics();
    
    g.setColor(color);
    g.drawOval(16,16,rad * 2,rad * 2);
    g.setColor(Color.BLUE);
    
    int x = 16 + rad;
    int y = 16 + rad;
    g.drawLine(x,y,x,y);
    
    int dir = 0;
    int cycles = 0;
    while(pointInsideCircle(x,y,rad+16,rad+16,rad)) {
      dir = rand.nextInt(4);
      if(dir < 1){
        x++;
      }else if(dir < 2){
        x--;
      }else if(dir < 3){
        y++;
      }else if(dir < 4){
        y--;
      }
      g.drawLine(x,y,x,y);
      cycles++;
      panel.sleep(1);
    }
    System.out.println("After " + cycles + " steps, the walk is finished.");
  }
  public static String promptString(String s){
  System.out.print(s);
    String str = console.nextLine();
    if(str.length() == 0)
      str = console.nextLine();
    return str;
  }
  public static boolean matchesChoice(String str1, String str2) {
    str1 = str1.toLowerCase().trim();
    str2 = str2.toLowerCase().trim();
    if(str1.length() > 1)
      return str1.equals(str2);
    else if(str1.length() == 1)
      return str1.charAt(0) == str2.charAt(0);
    else
      return false;
  }
  public static boolean pointInsideCircle(int x, int y, int cx, int cy, int r) {
    return Math.pow(x-cx,2) + Math.pow(y-cy,2) < Math.pow(r,2);
  }
}