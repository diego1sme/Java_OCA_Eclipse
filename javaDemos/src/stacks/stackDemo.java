package stacks;
import java.util.*;
public class stackDemo {
	public static void main(String [] args){
		reverseString("hello");
	}
	public static void reverseString(String toReverse){
		Stack stack = new Stack();
		String reversed = "";
		int sizeOfString = toReverse.length();
		for(int i = 0; i < sizeOfString; i++){
			stack.add(toReverse.charAt(i));
		}
		for(int j = 0; j < sizeOfString; j++){
			char ch = (char) stack.pop();
			reversed += ch;
		}
		System.out.println(reversed);
	}

}
