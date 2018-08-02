package university;
import java.util.Scanner;

public class test {

	 public static void main(String[] args) {
	        Scanner userInput = new Scanner(System.in);
	        System.out.println("#Enter size of diamond");
	        
	        int longestRow = userInput.nextInt();
	        
	        for(int row=1 ; row<=longestRow ; ++row)

	{

	int i = (2*row) - 1;

	if(i>longestRow) i = 2*(longestRow-row+1) - 1;

	for(int j=0 ; j<(longestRow-i)/2 ; ++j) System.out.print(".");

	for(int j=0 ; j<i ; ++j) {
	    if (j == 0 || j == (i-1)) {
	        System.out.print("*");
	    } else {
	        System.out.print(".");
	    }
	}

	for(int j=0 ; j<(longestRow-i)/2 ; ++j) System.out.print(".");

	System.out.println();
	userInput.close(); 
	}
	 }
}
