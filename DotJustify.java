package charon;

import java.util.Scanner;

public class DotJusify {

	public static Scanner userInput = new Scanner(System.in);
	/**
	 * @param args
	 */
	
	public static void main(String[] args){
		
		int intWidth;
		intWidth = getWidth();
		String strLine;
		strLine = getLines();
		
		notEnd(strLine, intWidth);
		
		
		userInput.close();
	}
	
	public static int getWidth(){
		
		System.out.println("#Enter max width");
		
		int intMax = userInput.nextInt();
		userInput.nextLine();
		
		return intMax;		
	}
	
	public static String getLines(){
		System.out.println("#Enter lines");
		
		String strInput = userInput.nextLine();
		
		return strInput;	
	}
	
	
	public static void notEnd(String strLine, int intWidth) {
		while (!strLine.equals("END")) {
			int intSpaceReq;
			int intSpaceCount;
			int intSpaceToGap;
			int intSpaceRem;
			String strSpace;
			
			
			
			// Check SpaceCount
			intSpaceCount = countSpaces(strLine);
			System.out.println("#Space Count " + intSpaceCount);
			
			// THis doesn't take into accounts spaces existing the string
			
			// Check SpaceReq
			intSpaceReq = getSpaces(strLine, intWidth, intSpaceCount);
			System.out.println("#Spaces Required " + intSpaceReq);
			
			
			// Check Space to Gap
			intSpaceToGap = spaceDivision(intSpaceReq, intSpaceCount);
			System.out.println("#Spaces per gap " + intSpaceToGap);
			
			// Check Space Remainder
			intSpaceRem = spaceMod(intSpaceReq, intSpaceCount);
			System.out.println("#Remainder " + intSpaceRem);
			
			// Check and Convert int to Spaces
			strSpace = addSpaces(intSpaceToGap);
//			strSpace = strSpace.replace(' ', '.');
//			System.out.println(strSpace);
			
			// Formulating output
			
			String strSpaced;
			String strOutput;
			//Split strings at spaces
			strSpaced = splitStrings(strLine, strSpace, intSpaceRem);
			
			// Check split
			System.out.println(strSpaced);
			
			
			strOutput = spaceReplace(strSpaced);
			// Check output
			System.out.println(strOutput);
			
			strLine = reAssign();
		}
	}
	
	public static int getSpaces(String strLine, int intWidth, int intSpaceCount){
		int intSpaceReq = intWidth - strLine.length() + intSpaceCount;
		return intSpaceReq;
	}
	
	public static int countSpaces(String strLine){
		char x;
		int intSpaceCount = 0;
		for (int i=0; i < strLine.length(); i++){
			x = strLine.charAt(i);
			if (x == ' '){
			 intSpaceCount += 1;
			}
		}
		return intSpaceCount;
	}
	
	public static int spaceDivision(int intSpaceReq, int intSpaceCount){
		int intSpaceToGap;		
			if ((intSpaceCount % 2) != 0){
				intSpaceToGap = intSpaceReq / (intSpaceCount-1);
			}
			else {
				intSpaceToGap = intSpaceReq / intSpaceCount;
			}
		return intSpaceToGap;		
	}
	
	public static int spaceMod(int intSpaceReq, int intSpaceCount){
	int intSpaceRem = intSpaceReq % intSpaceCount;
	return intSpaceRem;
	}
	
	public static String addSpaces(int intSpaceToGap){
		String strSpace = "";
		for (int x = intSpaceToGap; x > 0; x--){
			strSpace += " ";
		}
		return strSpace;
	}
	
	public static String splitStrings(String strLine, String strSpace, int intSpaceRem){
		String strRet = "";
		System.out.println(strSpace);
		for (String splitStr: strLine.split(" ")){
		 // Resolve adding space to last word
			strRet += splitStr + strSpace;
//			if (intRem > 0) {
//				
//			}
			// If in here to resolve remainder... somehow
		}
		
		return strRet;
	}
	
	public static String spaceReplace(String strSpaced){
		
		String strOutput;			
			
		strOutput = strSpaced.replace(' ', '.');
				
		return strOutput;
	}
	
	public static String reAssign(){
		
		String strLine = userInput.nextLine();
		return strLine;
		
	}
}