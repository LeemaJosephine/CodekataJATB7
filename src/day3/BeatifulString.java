package day3;

import java.util.Scanner;

public class BeatifulString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(isBeautiful(str));
	}

	private static int isBeautiful(String str) {
		// TODO Auto-generated method stub
		
		int length=str.length();
		
		if(length < 3)
			return 0;
		
		if(str.charAt(0) != 'a' && str.charAt(0) != 'A')
			return 0;
		
		if(str.charAt(length - 1) != 'z' && str.charAt(length-1) != 'Z')
			return 0;
		
		if(str.charAt(length/2) != 'm' && str.charAt(length/2) !='M')
			return 0;
		
		return 1;
	}

}
