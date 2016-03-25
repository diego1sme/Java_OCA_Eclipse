public class loop{
  public static void main(String [] args){
    block(5);
    javablock();
    block(3);
    javablock();
    block(8);
    for(int p = 0;p<=5; p++){
      for(int q = 0; q<=5; q++){
        System.out.println(p);
        System.out.print((p*q)+" ");
      }
      System.out.println();
    }
  }
  public static void block(int g){
    System.out.println(g);
    System.out.println("+-------+");
    System.out.println("|       |");
    System.out.println("+-------+");
  }
  public static void javablock(){
    System.out.println("| java  |");
  }
}