
public class MyException {
	static class BadFoodException extends Exception{}
	public static void main(String [] args){
		try{
			checkFood(args[0]);
		}
		catch(BadFoodException ex){
			System.out.println("just no");
			return;
		}
		System.out.println("ok");
	}
	static void checkFood(String s) throws BadFoodException{
		String sl = "suck";
		if(sl == "suck"){
			try {
				throw new BadFoodException();
			} catch (BadFoodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
