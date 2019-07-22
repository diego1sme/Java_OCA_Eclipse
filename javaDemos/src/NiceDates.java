import java.time.*;
import java.time.format.*;
public class NiceDates {
	public static void main(String[] args){
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern(
				"MMM dd, yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern(
				"E MMM dd, yyyy G");
		DateTimeFormatter tf1 = DateTimeFormatter.ofPattern(
				"k:m:s A a");
		
		LocalDate d = LocalDate.now();
		String s = d.format(f1);
		
		System.out.println(s);
		System.out.println(d.format(f2));
		
		LocalTime t = LocalTime.now();
		System.out.println(t.format(tf1));
		
		int [] testScores;
		testScores = new int[] {4,7,2};
		
		System.out.println(testScores[0]);
		int [] weightList = new int[3];
		byte b = 4;
		char c = 'c';
		short s2 = 7;
		weightList[0] = b;
		weightList[1] = c;
		weightList[2] = s2;
		for(int xx: weightList){
			System.out.println(xx);
		}
		int [] blots;
		int [] [] squeegees = new int[3][];
	}

}
