import java.io.IOException;


public class exceptions {
	public static void main(String [] args){
		try {
			doStuff();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void doStuff() throws IOException{
		try{
			throw new IOException();
		}catch(IOException ex){
			throw ex;
		}
	}
}
