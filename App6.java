package university;
import java.util.Scanner;

public class App6 {

	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		userInput.useDelimiter("\n");
		
		int intMark;
		String strGrade ="";
		String strName;
		
		System.out.println("#Enter name");
		strName = userInput.nextLine();
		
	       while (!strName.equals("END")) {
	           System.out.println("#Please enter the mark:");
	           intMark = userInput.nextInt();
	           
	           if (intMark >= 70) {
	              strGrade = "1st";
	           } 
				else if (intMark >= 60) {
		              strGrade = "2.1";
		        }
				else if (intMark >= 50){
					strGrade = "2.2";
				}
				else if (intMark >= 40){
					strGrade = "3rd";
				}
				else {
					strGrade ="fails";
				}
	           
	           if (strGrade.equals("fails")){
	        	   System.out.printf("%s [%d] %s \n", strName ,intMark, strGrade);
	           }
	           else {
	        	   System.out.printf("%s [%d] gains a %s \n", strName ,intMark, strGrade);
	           }
	          System.out.println("#Enter name");
	          strName = userInput.next();
	      }
	       
	       userInput.close();		
	}
}
