import java.util.*;

public class StarWarsName{
  
  
  
  public static void main(String [] args){
    System.out.println("lab 4 by diego romero");
    System.out.println();
    System.out.println("StarWars Name Generator");
    
    String first = promptString("Enter your first name:");
    String last = promptString("Enter your last name:");
    String maiden = promptString("Enter your mother's maiden name;");
    String city = promptString("Enter the city you where born in:");
    String car = promptString("Enter the first car you ever drove");
    
    String nfirst = first.substring(0,3) + last.substring(0,2);
    String nlast = maiden.substring(0,2) + city.substring(0,3);
    String ncity = last.substring(last.length()-2, last.length()) + car;
    
    System.out.println("You are "+ nfirst.toUpperCase() + " " + nlast.toUpperCase() + " from " + ncity.toUpperCase());
    
    
  }
  public static String promptString(String prompt){
   Scanner console = new Scanner(System.in); 
   System.out.print(prompt);
   return console.nextLine().trim();
  }
}