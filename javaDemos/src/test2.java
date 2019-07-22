

public class test2 {

	static public void main(String [] args){
		char a = 'a';
		switch(a){
		default: 
			System.out.println("default");
			break;
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		}
	
		/*do{
			System.out.println("Inside loop");
		}while(false);*/
		for(int i = 0; i < 10; i++){
			System.out.println("Inside loop");
			if(i == 5){
				continue;
			}
			System.out.println("outside loop"+i);
		}
		int y = 0;
		outer:
			while(y <= 21){
				y++;
				
			}
	}
}
