package day3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev ="";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}

}
