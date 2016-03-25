import java.util.*;
public class Binary {
  
  public static void main(String args[]) {
    System.out.println("Lab 8 written by Diego Romero");
    boolean cont = true;
    
    while(cont = true){
      Scanner console = new Scanner(System.in);
      int dec = 0;
      boolean posInt = true;
      /*couldnt get it to work first time using the 
       * exception thing and its to late to change it
       */
      while(posInt = true){
        System.out.print("Please enter a decimal number: ");
        try{  
          dec = console.nextInt();
          if(dec < 0)
            throw new Exception();
          posInt = false;
        } catch(Exception e) {
          System.out.println("Try Again.");
          dec = console.nextInt();
        }
      }
      
      int[] bin = convertIntToBit(dec);
      String s = arrayToString(bin);
      System.out.println(dec + " in binary is " + s + ".");
      
      posInt = true;
      s = "";
      while(posInt) {
        System.out.print("Please enter a binary number ");
        s = console.nextLine();
        if(s.length() == 0)
          s = console.nextLine();
        if(!isBinAString(s))
          System.out.println("Try Again.");
        else
          posInt = false;
      }
      
      bin = stringToArray(s);
      dec = convertBitArrayToInt(bin);
      System.out.println(s + " in decimal is " + dec + ".");
      
      
      posInt = true;
      while(posInt) {
        System.out.print("Would you like to continue? (yes or no): ");
        String contStr = console.nextLine();
        if("no".startsWith(s)) {
          posInt = false;
          cont = false;
        }
        else if ("yes".startsWith(contStr))
          posInt = false;
        else
          System.out.println("ERROR: Invalid input.");
      }
    }
    System.out.println("Thank You!");
  }
  
  private static int[] convertIntToBit(int val) {
    int[] bin = new int[31];
    int index = 0;
    while(val != 0) {
      if(val % 2 != 0)
        bin[index] = 1;
      else
        bin[index] = 0;
      val/=2;
      index++;
    }
    return bin;
  }
  private static int convertBitArrayToInt(int[] bin) {
    int increment = 1;
    int val = 0;
    for(int i = 0; i < bin.length; i++) {
      if(bin[i] == 1)
        val+=increment
        ;
      increment*=2;
    }
    return val;
  }
  
  //converts a bit String into an int array
  private static int[] stringToArray(String bitString) {
    int bLength = bitString.length();
    int[] bitArray = new int[bLength];
    int bIndex = bLength - 1;
    for (int i = 0; i < bLength; i++) {
      char c = bitString.charAt(bIndex);
      if (c == '0') {
        bitArray[i] = 0;
      } else if (c == '1') {
        bitArray[i] = 1;
      } else {
        throw new IllegalArgumentException
          (bitString + " should only be 0s and 1s");
      }
      bIndex--;
    }
    return bitArray;
  }
  private static boolean isBinAString(String test) {
    for(int i = 0; i < test.length(); i++) {
      if(test.charAt(i) != '1' && test.charAt(i) != '0')
        return false;
    }
    return true;
  }
  
  private static String arrayToString(int[] array) {
    int bitLength = array.length;
    String bitString = "";
    for (int i = 0; i < bitLength; i++) {
      if (array[i] == 0 || array[i] == 1) {
        bitString = array[i] + bitString;
      } else {
        throw new IllegalArgumentException
          (Arrays.toString(array) + " should only be 0s and 1s");
      }
    }
    
    int first = bitString.indexOf('1');
    if (first == -1) { 
      bitString = "0";
    } else {
      bitString = bitString.substring(first, bitLength);
    }
    return bitString;
  }
}

