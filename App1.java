package university;
import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int intCw;
		int intEx;
		double intOut;
		
		intCw = userInput.nextInt();
		intEx = userInput.nextInt();
		intOut = intCw + intEx;
		intOut /= 2;
		
		
		System.out.printf("ex = %d cw = %d  mark = %3.1f", intCw, intEx, intOut);
		userInput.close();
		}
		
}
