import java.util.*;
class Coins{
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String [] args){
    System.out.println("Lab 1 by Diego Romero\n");
    addCoins();
    splitCoins();
  }
  public static void addCoins(){
    System.out.println("How many Quarters:");
    double quarters = CONSOLE.nextInt();
    System.out.println("How many Dimes:");
    double dimes = CONSOLE.nextInt();
    System.out.println("How many Nickels:");
    double nickles =CONSOLE.nextInt();
    System.out.println("How many pennies:");
    double pennies=CONSOLE.nextInt();
    int add = (int)quarters + (int)dimes + (int)nickles + (int)pennies;
    double qtod= quarters/4;
    double dtod= dimes/10;
    double ntod= nickles/20;
    double ptod= pennies/100;
    double dollars= qtod + dtod + ntod + ptod;
    
    System.out.println("The total amount of coins is:"+add +"\tWhich equals to:$" + dollars);
  }
  public static void splitCoins(){
    System.out.println("How many Coins:");
    int coins = CONSOLE.nextInt();
    int convertQuarters = coins/25;
    int remainder1=coins%25;
    int convertDimes = remainder1/10;
    int remainder2 = remainder1%10;
    int convertNickles = remainder2/5;
    if(convertNickles == 0){
      int convertPennies = remainder2;
      System.out.println("Number of Quarters:"+ convertQuarters +"\tNumber of Dimes:"+ convertDimes);
      System.out.print("Number of nickles:" +convertNickles+"\tNumber of pennies:" +convertPennies);
    }else{
      int remainder3 = remainder2%5;
      int convertPennies = remainder3;  
      System.out.println("Number of Quarters:"+ convertQuarters +"\tNumber of Dimes:"+ convertDimes);
      System.out.print("Number of nickles:" +convertNickles+"\tNumber of pennies:" +convertPennies);
    }
  }
    
}