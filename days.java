public class days{
  public static void main(String [] args){
    int days = numberDaysInMonth(2, 2400);
    System.out.println(days);
  }
  public static int numberDaysInMonth(int m, int y){
    if(m >=1 && m <= 12 && m > 0){
      if(m ==9 || m == 4 || m == 6 || m ==11){
        return 30;
      }else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 12 ){
          return 31;
      }else if(m == 2){
          if(y % 100 == 0 && y % 400 ==0){
          return 29;
          }else if (y % 4 ==0){
            return 29;
          }else{
            return 28;
          }
      }
    }
    return 0;
  }
}
        
          