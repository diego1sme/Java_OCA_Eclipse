package pkgB;
import pkgA.*;
public class Baz {
	public static void main(String [] args){
		Foo f = new Foo();
		System.out.println(f.c);
	}
}
