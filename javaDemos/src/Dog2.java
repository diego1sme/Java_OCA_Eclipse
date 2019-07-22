
public class Dog2 {
	String name;
	int weight;
	int age;
	Dog2(String name, int weight, int age){
		this.name= name;
		this.weight = weight;
		this.age = age;
	}
	
	String getName(){return name;}
	int getWeight(){return weight;}
	int getAge(){return age;}
	public String toString(){
		return name;
	}
}

