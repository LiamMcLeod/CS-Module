package university;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args){
			
			Scanner userInput = new Scanner(System.in);
			userInput.useDelimiter("\n");
			
			int intCw, intEx;
			double doMark;
			String strGrade ="";
			String strName;
			
			System.out.println("#Enter name");
			strName = userInput.nextLine();
			
		       while (!strName.equals("END")) {
		           System.out.println("#Please enter coursework mark:");
		           intCw = userInput.nextInt();
        		   System.out.println("#Please enter exam mark:");
		           intEx = userInput.nextInt();
		           
		           doMark = intCw + intEx;
		           doMark /= 2;
		           
		           if (doMark >= 40 && intCw >= 30 && intEx >= 30) {
		        	     strGrade = "Pass";
				       }
		        	else if (doMark < 40) {
		              strGrade = "Fail";
		        	}
		            else if (doMark > 40 && (intCw < 30 || intEx < 30)) {
			    	  strGrade = "Fail [Threshold]";
				    }
			        else {
			        	strGrade = "Fail";
			        }
		       
		          System.out.printf("%s [%d,%d] %3.1f %s \n", strName, intCw, intEx ,doMark, strGrade);

		          System.out.println("#Enter name");
		          strName = userInput.next();
		      }
		       
		       userInput.close();		
		}
	
}
