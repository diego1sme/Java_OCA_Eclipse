import java.util.function.Predicate;
public class Sheep {
	public static void main(String [] args){
		Sheep s = new Sheep();
		s.go(x-> adder(6,2)<9);
		//s.go(()->adder(5,1) < 7);
		//s.go(x,y -> adder(3,2) < 4);
	}
	void go(Predicate<Sheep> e){
		Sheep s2 = new Sheep();
		if(e.test(s2)){
			System.out.println("true ");
		}else{
			System.out.println("false ");
		}
	}
	static int adder(int x, int y){
		return x+y;
	}
}
