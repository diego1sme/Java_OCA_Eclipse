class Special{
	private StringBuilder s = new StringBuilder("bob");
	StringBuilder getName(){return s;}
	void printName(){System.out.println(s);}
}
public class TestSpecial {
	public static void main(String [] args){
		Special sp = new Special();
		StringBuilder s2 = new StringBuilder(sp.getName());
		s2.append("fred");
		sp.printName();
	}
}
