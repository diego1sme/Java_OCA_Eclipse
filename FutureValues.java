import java.util.*;


public class FutureValues {
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String args[]) {
    
    System.out.println("Lab 3 written by Diego Romero");
    System.out.println();
    
    System.out.println("Enter values to calculate compound interest:");
    System.out.println("Present account Value in dollars:");
    double pv = CONSOLE.nextDouble();
    System.out.println("Present account Value in dollars:");
    double ir = CONSOLE.nextDouble();
    System.out.println("Number of years: ");
    double y = CONSOLE.nextDouble();
    double compInterest = compInterest(pv, ir, y);
    System.out.println("Future value of the account: " + compInterest(pv, ir, y));
    System.out.println();
    
    System.out.println("Enter values to calculate the future value of an annuity:");
    System.out.println("Yearly paymernt in dollars:");
    double yp = CONSOLE.nextDouble();
    System.out.println("Interest rate in percentage:");
    double ir2 = CONSOLE.nextDouble();
    System.out.println("Number of years:");
    double y2 = CONSOLE.nextDouble();
    double annuity = annuity(yp, ir2, y2);
    System.out.println("Future value of the annuity: " + annuity(yp, ir2, y2));

}
  
  //This method takes three arguments and uses them to return the final value of an account gaining compound interest.
  private static double compInterest(double pv, double ir, double y) {
    return pv * Math.pow((1 + ir/100),y);
  }
  
  //This method takes three arguments and uses them to return the final value of an annuity.
  private static double annuity(double yp, double ir2, double y2){
    return yp * ((Math.pow(1+(ir2/100),y2)-1) / (ir2/100));
  }
}