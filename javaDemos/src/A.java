
public class A {}

class B extends A{
	public static final void main(String [] args){
		A myA = new A();
		m2(myA);
	}
	public static void m2(A a){
		if(a instanceof B){
			((B)a).doBStuff();
		}
	}
	public static void doBStuff(){
		System.out.println("'b' refers to a B");
		
	}
}
