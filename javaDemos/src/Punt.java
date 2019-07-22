import java.util.*;
import java.sql.*;
public class Punt {
	public static void  main(String [] args){
		Punt p = new Punt();
		Object o = p.go(new Punt());
		Punt [] p2 = (Punt[])o;
		System.out.println(p.equals(p2[0] + " " + (p == p2[0])));
		//private Date rob = new Date();
		final java.util.Date sharon = new java.util.Date();
	}
	Punt [] go (Punt p){
		Punt[] p2 = {p};
		return p2;
	}
}
