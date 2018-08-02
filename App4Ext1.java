package university;
import java.util.Scanner;

public class App4Ext1 {
	
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		int intInput;
		
		intInput = userInput.nextInt();
		
		String strOutput = drawSquare(intInput);
		int intOutput = countSquare(intInput);
		
		for (int x = 0; x < intInput; x++) {
			System.out.println(strOutput);
			}
		
		System.out.println(intOutput);
		
		userInput.close();
	}	
	
	public static String drawSquare(int intInput) {
		
		String strOutput = "";

				for (int y = 1; y < intInput; y++) {
					strOutput += "*";
				}
				strOutput += "*";
							
		return (strOutput);
	}	
	
	
public static int countSquare(int intInput) {
		
		intInput *= intInput;
		
		return intInput;
}	
	
	
}
	
	