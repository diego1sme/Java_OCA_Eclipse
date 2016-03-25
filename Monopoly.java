import java.util.*;
public class Monopoly
{
  public static final Scanner console = new Scanner(System.in);
  public static void main (String[]args)
  {
  System.out.println("Science");
  int [] num = new int [] {100, 200, 300, 400, 500, 600, 700};
  for(int i = 0; i < 7;i++)
  {
   System.out.print(num[i]);
   for(int j = 0; j < 6; j++)
   {
     int input = console.nextInt();
     System.out.print(input);
   }
   System.out.println();
  }
  }
}