public class Propogate {
	public static void main(String [] args){
		try{
			reverse(" ",0);
		}
		catch(IllegalArgumentException e){
			System.out.println("please give string");
			return;
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
			return;
		}
		finally{
			System.out.println("code ran");
		}
		System.out.println("outside");
	}
	
	public static String reverse(String s,int q){
		if(s.length() == 0){
			throw new IllegalArgumentException("can't do");
		}
		if(q == 0){
			throw new ArithmeticException("no 0");
		}
		String reverseStr = "";
		for(int i = s.length()-1;i>=0;--i){
			reverseStr +=s.charAt(i);
		}
		return reverseStr;
	}
	
}
