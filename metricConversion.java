import java.util.*;
class metricConversion{
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String [] args){
    System.out.println("Project 1 by Diego Romero");
    kilogramsToPounds();
    tableforFIM();
  }
  
  public static void kilogramsToPounds(){
    System.out.println("Enter the minimum amount of kilograms you want to change:");
    int minimumK =  CONSOLE.nextInt();
    System.out.println("Enter the maximum amount of kilograms you want to change:");
    int maximumK =  CONSOLE.nextInt();
    System.out.println("kilograms to pounds");
    System.out.println();
    System.out.println("kilograms\tpounds");
    System.out.println("-----------------");
    for(int i = minimumK; i <= maximumK; i++){
      System.out.println(i+"    =   "+(i/0.45359237));
      
    
  }
    System.out.println();
  }
  
  public static void tableforFIM(){
    double feet;
    System.out.println("Conversion from Feet and Inches to Meters");
    System.out.println("-----------------------------------------");
    System.out.println();
    System.out.println("\tInches");
    System.out.println("Feet\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11");
    
    for(int f = 0; f <= 9; f++) {
      System.out.print(f);
      for(int i = 0; i <= 11; i++) {
        feet = f + (double) i/12;
        System.out.printf("\t%.3f", feet * 0.3048);
      }
      System.out.println();
    }
  }
}
    
   

