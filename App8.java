package university;
import java.util.Scanner;

public class App8 {

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
				
		int intInput;
		System.out.println("#Enter diamond size:");
		intInput = userInput.nextInt();
		
		
				
		if (intInput % 2 == 0) {
			System.out.println("#Int must be odd");
			main(args);
		}
		else if (intInput < 5 ||intInput > 41) {
			System.out.println("#Int must be >= 5 and <=41");
			main(args);
		}
		else {
			
			
			
			
// Research -------------------------------- RESEARCH ------------- RESEARCH
		     
			for (int z=1 ; z<=intInput ; ++z)  {

				int x = (2*z) - 1;

				if(x>intInput){
					x = 2*((intInput-z)+1) - 1;
				}
				topBottom(intInput, x);
				middleRows(intInput, x);
				topBottom(intInput, x);

				System.out.println();

			}
			
			
			userInput.close();
		}
	}
	
	public static void topBottom(int intInput, int x) {
		for(int y=0 ; y<(intInput-x)/2 ; ++y) {
			System.out.print("."); 
			
			// Loop #1: .. ..
			// Loop #2:
		}
	
	}
	
	public static void middleRows(int intInput, int x) {
		for(int y=0 ; y<x ; ++y) {
			if (y == 0 || y == (x-1)) {
				System.out.print("*");
			} else {
				System.out.print(".");
			}
			// Loop #1: __*__
			// Loop #2:
		}
	}
	
}
