class poems{
  //print little lamb first verse
  //print This Old Man first three verses
  public static void main(String [] args) {
    System.out.println("Lab 1 by Diego Romero\n");
    maryHadALittle();
    thisOldMan();
  }
  public static void maryHadALittle(){
    System.out.println("Mary Had A Little Lamb");
    System.out.println("----------------------");
    line1();
    line2();
    line3();
    line4();
  }
  public static void thisOldMan(){
    System.out.println("This Old Man");
    System.out.println("------------");
    verse1();
    verse2();
    verse3();
  }
      
  public static void line1(){
    System.out.println("Mary had a little lamb,");
  }
  public static void line2(){
    System.out.println("Little lamb, little lamb,");
  }
  public static void line3(){
    System.out.println("Mary had a little lamb,");
  }
  public static void line4(){
    System.out.println("Its fleece was white as snow\n");
  }
  public static void verse1(){
    System.out.println("This old man, he played one\nHe played knick-knack on my thumb");
    refrainTOM();
  }
  public static void verse2(){
    System.out.println("This old man, he played two\nHe played knick-knack on my shoe");
    refrainTOM();
  }
  public static void verse3(){
    System.out.println("This old man, he played three\nHe played knick-knack on my knee");
    refrainTOM();
  }
  public static void refrainTOM(){
    System.out.println("With a knick-knack patty-whack, give a dog a bone\nThis old man came rolling home\n");
  }
  
    
}
