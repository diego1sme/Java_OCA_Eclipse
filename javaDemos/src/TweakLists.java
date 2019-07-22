import java.util.*;
public class TweakLists {
	static public void main(String args[]){
		List<String> myList = new ArrayList<String>();
		myList.add("z");
		myList.add("x");
		myList.add(1,"y");
		myList.add(0,"w");
		System.out.println(myList);
		myList.clear();
		myList.add("b");
		myList.add("a");
		myList.add("c");
		System.out.println(myList);
		System.out.println(myList.contains("a")+ " "
				+ myList.contains("x"));
		System.out.println("get 1: "+ myList.get(1));
		myList.remove(1);
		System.out.println("size: "+ myList.size() + 
				" contents: "+myList);
		Integer i1 = 1000;
		Integer i2 = 1000;
		if(i1 == i2)System.out.println('s');
		if(i1.equals(i2)) System.out.println('e');
		}
}
