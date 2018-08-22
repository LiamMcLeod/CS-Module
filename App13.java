package charon;
import java.util.Scanner;

public class App13 {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		
		String strInput = ""; 
		String strOutput = "";
		String strTest = "";
		
		System.out.println("#Enter text");
		strInput = userInput.nextLine();
		strTest = strInput.toLowerCase();
		
		
		while (!strInput.equals("END")) {
			for (int i = 0; i < strInput.length()-1; i++) {
				
				char charX = strTest.charAt(i);
				char charY = strTest.charAt(i+1);
				
				if (charX <= charY) {
					strOutput = "letters in ascending order";
				}
				else {
					
					strOutput = "letters not in ascending order";
					break;
					
				}
				
			}
			
			System.out.println(strInput + " " + strOutput);
			
			strInput = "";
			strInput = userInput.nextLine();

			strTest = strInput.toLowerCase();
		}
		
		
		userInput.close();
		
	}
}
