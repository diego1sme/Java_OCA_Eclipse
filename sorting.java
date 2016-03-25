import java.util.*;
public class sorting{
  public static void main(String [] args){
   int num = getOneToTen("Enter a integer");
   System.out.println(num);
  }
  public static int getOneToTen(String prompt){
    Scanner console = new Scanner(System.in);
    System.out.println(prompt);
   while(console.hasNextInt()){
     if( > 1 &&  < 10){
       break;
     }else{
       System.out.println("enter new");
       check = console.nextInt();
     }
     
   }
   return check;
  }
}