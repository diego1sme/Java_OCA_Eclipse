import java.awt.*;
import java.util.*;

public class Circles{
  
  public static void main(String [] args){
    Scanner console = new Scanner(System.in);
    System.out.println("Lab 5 by Diego Romero");
    
    //gets values
    System.out.println("Please enter coordinates and radius for a red circle:");
    int x1 = console.nextInt();
    int y1 = console.nextInt();
    int r1 = console.nextInt();
    System.out.println("Please enter coordinates and radius for a green circle:");
    int x2 = console.nextInt();
    int y2 = console.nextInt();
    int r2 = console.nextInt();
    System.out.println("Please enter coordinates and radius for a black circle:");
    int x3 = console.nextInt();
    int y3 = console.nextInt();
    int r3 = console.nextInt();
    
    int comparer1 = promptCompareSize(r1,r2);
    int comparer2 = promptCompareSize(r2,r3);
    int comparer3 = promptCompareSize(r1,r3);
    
    int comparec1 = promptCompareCor(x1,y1,r1,x2,y2,r2);
    int comparec2 = promptCompareCor(x2,y2,r2,x3,x3,r3);
    int comparec3 = promptCompareCor(x1,y1,r1,x3,y3,r3);
    
    if(comparer1 == 0){
      System.out.println("The red circle is the same size as the green circle");
    }else if(comparer1 == 1){
      System.out.println("The red circle is bigger than the green circle");
    }else if(comparer1 == -1){
      System.out.println("The red circle is smaller than the green circle");
    }
    
    if(comparer2 == 0){
      System.out.println("The green circle is the same size as the black circle");
    }else if(comparer2 == 1){
      System.out.println("The green circle is bigger than the black circle");
    }else if(comparer2 == -1){
      System.out.println("The green circle is smaller than the black circle");
    }
    
    if(comparer3 == 0){
      System.out.println("The red circle is the same size as the black circle");
    }else if(comparer3 == 1){
      System.out.println("The red circle is bigger than the black circle");
    }else if(comparer3 == -1){
      System.out.println("The red circle is smaller than the black circle");
    }
    
    System.out.println();
    
    if(comparec1 == 1){
      System.out.println("Red circle and Green circle intersect");
    }
    if(comparec2 == 1){
      System.out.println("Green circle and Black circle intersect");
    }
    if(comparec3 == 1){
      System.out.println("Red circle and Black circle intersect");
    }
    
    
    DrawingPanel panel = new DrawingPanel(400, 300);
    Graphics g = panel.getGraphics();
    
    //prints out the circles
    g.setColor(Color.red);
    g.fillOval(x1,y1,r1,r1);
    g.setColor(Color.green);
    g.fillOval(x2,y2,r2,r2);
    g.setColor(Color.black);
    g.fillOval(x3,y3,r3,r3);
  }
  public static int promptCompareSize(int rad1, int rad2){
    if(rad1 == rad2){
      return 0;
    }else if(rad1 > rad2) {
    return 1;
    }else {
    return -1;
    }
  }
  public static int promptCompareCor(int x2, int y2,int r2, int x3, int y3, int r3){
    double cor = Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2);
    double rad = r2 +r3;
    if(cor <= rad){
    return 1;
    }else{
      return 0;
    }
    
    
  }
}
