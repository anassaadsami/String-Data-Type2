package stringDataType;

import java.util.Scanner;

public class FodelseDag {

	public static void main(String[] args) {
		String year = personNum();
		System.out.println(year);
		int the_age = yourOld(year);
		System.out.println(the_age);
		

	}
	public static String personNum() {
		System.out.print("enter your person num (yyyymmdd):\n");
		Scanner input = new Scanner(System.in);	
		 String num = input.next();
		 
		 while(num.length() != 8) {
			 System.out.print("wronge num,try again:");
			 num = input.next();
			 input.close();
		 } 
		 String år = num.substring(0, 4);
		 return år;
	}

	public static int yourOld(String år) {
		
		int year_of_birth = Integer.parseInt(år);
		int your_age = 2021-year_of_birth ;
		
		 return your_age ;
}
}