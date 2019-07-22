class Animal{
	void makeNoise(){
		System.out.println("generic noise");
	}
}
class Dog extends Animal{
	void makeNoise(){System.out.println("bark");}
	void playDead(){System.out.println("roll over");}
}
public class ttes {
	public static void main(String [] args){
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for(Animal animal: a){
			animal.makeNoise();
			if(animal instanceof Dog){
				System.out.println(animal);
				Dog d = (Dog) animal;
				d.playDead();
			}
		}
	}
}
