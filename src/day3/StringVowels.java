package day3;

import java.util.Scanner;

public class StringVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		if(containsVowels(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	
	}
	
	public static boolean containsVowels(String str) {
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(isVowel(c)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isVowel(char c) {
		// TODO Auto-generated method stub //  COdekata
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c =='i' || c =='o' || c == 'u';
	}

}
