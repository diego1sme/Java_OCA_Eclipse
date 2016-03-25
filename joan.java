import java.util.*;
public class joan{
  public static void main(String [] args){
  int[] a = new int[3];

   int[] b = new int[3];

   int[] c = a;

   a[0] = 5;

   b[1] = 6;

   c[2] = 7;

   System.out.println(Arrays.toString(a));
  }
}