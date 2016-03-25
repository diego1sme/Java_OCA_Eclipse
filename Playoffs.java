import java.util.*;

public class Playoffs {
  
  public static void main(String args[]) {
    System.out.println("Lab 6 written by Diego Romero");
    Random rand = new Random();
    
    int chance = promptInt("Please enter the percentage chance team 1 will win :",0,100);
    championship(rand,chance);
  }
  
  //calculates  a  single game
  private static boolean singleGame(Random r, int chance) {
    int a = r.nextInt(100);
    return a < chance;
  }
  
  //calculates the chance of a playoff 
  private static boolean playoff(Random r, int chance) {
    int team1 = 0;
    int team2 = 0;
    while(team1 < 4 && team2 < 4) {
      if(singleGame(r,chance))
        team1++;
      else
        team2++;
    }
    return team1 > team2;
  }
  
  //calculates  who would be the champion
  private static void championship(Random r, int chance) {
    int team1W = 0;
    int team2W = 0;
    while(team1W < team2W + 10 && team2W < team1W + 10) {
      if(playoff(r,chance)) {
        team1W++; 
      }
      else {
        team2W++;
      }
    }
    System.out.println();
    System.out.println("Team 1 playoffs won: " + team1W);
    System.out.println("Team 2 playoffs won: " + team2W);
    if(team1W > team2W)
      System.out.println("Team 1 won the championship!\n");
    else
      System.out.println("Team 2 won the championship!\n");
  }
  
  //This method prompts the user for an integer value between min and max
  private static int promptInt(String prompt, int min, int max) {
    Scanner CONSOLE = new Scanner(System.in);
    int b = 0;
    boolean cont = true;
    
   while(cont) {
      System.out.print(prompt);
      if(CONSOLE.hasNextInt()) {
        b = CONSOLE.nextInt();
        if(b >= min && b <= max){
          cont = false;
        }else{
          System.out.println("Error: " + b + " is not between " + min + " and " + max + ".");
         
        }
      }
    }
    return b;
  }
}