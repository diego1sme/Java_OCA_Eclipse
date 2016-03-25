import java.util.*;

public class triple{
  
  public static void main(String [] args){
    
  Scanner scan = new Scanner(System.in);

         System.out.print("Enter two numbers: ");

         int x = scan.nextInt( );

         int y = scan.nextInt( );

         System.out.println(mystery(x,y));
         System.out.println(Math.round(0.67));

      }


      public static int mystery(int y, int x) {

         return 2 * x + y;

      }

   }