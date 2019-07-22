import java.util.*;
import java.util.function.Predicate;
public class TestDogs2 {
	public static void main(String [] args){
		ArrayList<Dog2> dogs = new ArrayList<>();
		dogs.add(new Dog2("boi",30,6)); dogs.add(new Dog2("tyri",40,12));
		dogs.add(new Dog2("charis",120,7)); dogs.add(new Dog2("aiko", 50,10));
		dogs.add(new Dog2("clover",35,12)); dogs.add(new Dog2("mia",15,4));
		dogs.add(new Dog2("zooey",45,8));
		
		System.out.println("all dogs " + dogs);
		System.out.println("min age 7 " + 
				minAge(dogs,7).toString());
		System.out.println("max wght. " + 
				maxWeight(dogs,40).toString());
		
		System.out.println("age < 9 "+dogQuery(dogs, d->d.getAge() < 9));
		System.out.println("w > 100" + dogQuery(dogs, d->d.getWeight() > 100));
	}

	static ArrayList<Dog2> minAge(ArrayList<Dog2> dogList,
			int testFor){
		ArrayList <Dog2> result1 = new ArrayList<>();
		for(Dog2 d: dogList)
			if(d.getAge() >= testFor)
				result1.add(d);
		return result1;
	}
	
	static ArrayList<Dog2> maxWeight(ArrayList<Dog2> dogList
			, int testFor) {
		ArrayList<Dog2> result1 = new ArrayList<>();
		for(Dog2 d: dogList)
			if(d.getWeight() <= testFor)
				result1.add(d);
		return result1;
	}
	static ArrayList< Dog2> dogQuery(ArrayList< Dog2> dogList,
		Predicate< Dog2> expr){
		ArrayList< Dog2> result1 = new ArrayList< >();
		for(Dog2 d: dogList)
			if(expr.test(d))
				result1.add(d);
		return result1;
	}	
}
