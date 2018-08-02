package university;
import java.util.Scanner;

public class App4Ext2 {

	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
			
			int intInput;
			System.out.println("#How many asterisks?");
			intInput = userInput.nextInt();
			
			if (intInput <= 1 || intInput % 2 == 0){
				main(args);
			}
			else {
			drawSquare(intInput);
			}	
			
			userInput.close();
		}	
		
		public static void drawSquare(int intInput) {
			
			starLines(intInput);
			middleLines(intInput);
			starLines(intInput);
						
		}	
		
		public static void starLines(int intInput) {
					
			for (int x = intInput-1; x < intInput; x++) {
				System.out.print("*");
				
				for (int y = 2; y < intInput; y++) {
					System.out.print("*");
				}
				System.out.println("*");
			}							
		}
		
		public static void middleLines(int intInput) {
			
			for (int x = 2; x < intInput; x++) {
				System.out.print("*");
				
				for (int y = 4; y < intInput; y++) {
					System.out.print(".+");
				}
				System.out.println(".*");
			}		
		}	

}
