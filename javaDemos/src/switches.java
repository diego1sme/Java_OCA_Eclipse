
import java.time.*;
import java.time.format.*;
public class switches {
	static int x = 7;
	public static void main(String [] args){
		String s ="";
		for(int y = 0; y < 3; y++){
			x++;
			switch(x){
			case 8: s+="8";
			case 9: s+="9";
			case 10:{s+="10";break;}
			default: s+="d";
			case 13: s+="13";
			}
		}
		System.out.println(s);
		String x = "big surprise";
		System.out.println(x.toString());
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(2, "---");
		System.out.println(sb);
		LocalDate d2000 = LocalDate.of(2_000, 1, 1);
		Period p2 = Period.between(d2000, LocalDate.now());
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern(
				"MMM dd.yyyy");
		//String st = p2.format(f1);
		System.out.println("period since Y2K:"+p2);
		
	}
	static {x++;}
}
