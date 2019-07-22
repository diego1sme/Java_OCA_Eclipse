
public class GuessAnimal {
	public static void main(String [] args){
		char a = 'g';
		if( a <= 'f'){
			System.out.println("a < f");
		}
		System.out.println((5.0 == 5));
		int x = 2, y=3;
		if((y == x++)|(x<++y)){
			System.out.println(x);
			x++;
		}
		System.out.println(x+ "out of loop");
		
		int sizeOfYard = 11;
		int numOfPets = 4;
		String status = (numOfPets < 4)? "Pet Count Ok":
			(sizeOfYard < 10) ? "Pet Limit On Edge":
				"too many pets";
		System.out.println("Pet status is: "+status);
		
		int z =5;
		if(++z > 5 | ++z > 6){z++;}
		System.out.println(z);
		System.out.println((true & false) == (false | true));
		
		long l = 42L;
		long j = 44L;
		System.out.print(""+7+2+" ");
		System.out.print(foo() + l + 5 + " ");
		System.out.println(l+j+foo());
		String s ="Hello";
		if("Hello" == s){
			System.out.println(s);
		}
		
		}
		static String foo(){return ("foo");}
}
