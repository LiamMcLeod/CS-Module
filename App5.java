package university;
import java.util.Scanner;

public class App5 {
	
	public static void main(String[] args) {
	      
	Scanner userInput = new Scanner(System.in);
       		userInput.useDelimiter("\n");
       
       int intMod;
       String strName ="";
       String strGrade ="";
       
       System.out.println("#Please enter the name:");
       strName = userInput.nextLine();
       
       while (!strName.equals("END")) {
           System.out.println("#Please enter the mark:");
           intMod = userInput.nextInt();
           
           if (intMod < 40) {
              strGrade = "Fail";
           } 
		else if (intMod >= 40) {
              strGrade = "Pass";
          	}
           
           System.out.printf("%s %s\n", strName, strGrade);
           
           System.out.println("#Please enter the name");
     		strName = userInput.next();
       }
       userInput.close();
   }
}



