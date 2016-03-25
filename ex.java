public class ex{
  
  public static void main(String [] args){
    String s1 = "2 B or not 2 B";

   String s2 = "";

   for (int i = 0; i < s1.length(); i++) {

      char ch = s1.charAt(i);

      s2 = ch + s2;

   }

   System.out.println(s2);


    
    
  }
}