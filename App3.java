package university;
import java.util.Scanner;

public class App3 {

		public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int intInput;
		
		intInput = userInput.nextInt();
		
			for (int x = 0; x < intInput; x++) {
				for (int y = 1; y < intInput; y++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
		
		userInput.close();
		}
}
