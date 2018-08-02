package university;
import java.util.Scanner;

public class App2 {

		
		public static Scanner userInput = new Scanner(System.in);
			
		public static void main(String[] args) {
			
			
			String strSn;
			int intCw = 0;
			int intEx = 0;
			double dOut = 0;
			
				strSn = userInput.nextLine();
				if (strSn.equals("0")){
					System.exit(0);
				}
				else if (strSn.length() < 8){
					main(args);
				}
				else {
					intCw = userInput.nextInt();
					intEx = userInput.nextInt();
					dOut = intCw + intEx;
					dOut /= 2;		
					System.out.printf("sn=%s ex=  %d cw=  %d mark =  %3.1f \n", strSn, intEx, intCw, dOut);
					main(args);
					userInput.close();
				}
				userInput.close();
			}
			
}


