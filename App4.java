package university;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	int intInput;
	
	intInput = userInput.nextInt();
	
	for (int x = intInput-1; x < intInput; x++) {
		System.out.print("*");
		
		for (int y = 2; y < intInput; y++) {
			System.out.print("*");
		}
		
		System.out.println("*");
	}
	
	for (int x = 2; x < intInput; x++) {
		System.out.print("*");
		
		for (int y = 2; y < intInput; y++) {
			System.out.print(".");
		}
		
		System.out.println("*");
	}
	
	for (int x = intInput-1; x < intInput; x++) {
		System.out.print("*");
		
		for (int y = 2; y < intInput; y++) {
			System.out.print("*");
		}
		
		System.out.println("*");
	}
	
	userInput.close();
	
	}
}
