package university;

import java.util.Scanner;

public class App10 {

public static Scanner userInput = new Scanner(System.in);


	// ( IntInput - 1 )	 / 2 = spacing between

	// Outside = 4 + intInput + 4 OR (intInput - 1)

	// 3 * intInput


	
	public static void main(String[] args){
				
		int intInput;
		System.out.println("#Enter Hex size:");
		intInput = userInput.nextInt();
		
		
				
		if (intInput %2 == 0) {
			System.out.println("#Int must be odd");
			main(args);
		}
		else if (intInput < 3 ||intInput > 41) {
			System.out.println("#Int must be >= 3 and <=41");
			System.out.println("Side of hex (*) must be odd");
			main(args);
		}
		else {
			
			userInput.close();
			
			int t = (intInput * 2) - 1;
			
//			if (t > intInput) {
//				t = 3 * ((intInput - z) + 2) - 2;
//				}
			
			int u = (intInput *3) - 2;
		
			
			for (int z = 1 ; z <= t; ++z)  {
				
				
				int x = (2 * z) - 1;
				if (x > intInput) {
				x = 2 * ((intInput - z) + 1) - 1;
				}
				
			
					
						
		
				

				drawSpaces(intInput, t); 
				drawStars(intInput, t, u);
				drawSpaces(intInput, t);

				System.out.println();
			}
						
			userInput.close();
		
		}
	}
	
	
	public static void drawSpaces(int intInput, int x) {
		for (int y = 0 ; y < (intInput - x) -1 ; ++y) {
			System.out.print("."); 
		}
	
	}
	
	
	public static void drawStars(int intInput, int x, int z) {
		for (int y = 0 ; y < x ; ++y) {
			// 1 = 5
			// 2 = 2
			// 3 = 4
			// 4 = 4
			// if Y == 0
			if (z == 1 || z == intInput) {
				
				System.out.println("*");
				
				
			}
			if (y == 0 || y == (x - 1)) {
				System.out.print("*");
			} 
			else {
				System.out.print(".");
			}
		}
	}
	
}
