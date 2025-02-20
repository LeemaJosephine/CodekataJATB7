package day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WonderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(isWonderful(str)) {
			System.out.println("Wonder");
		} else {
			System.out.println("-1");
		}
		
	}
	
	public static boolean isWonderful(String str){
		
		Set<Character> charSet = new HashSet<Character>();
		//abc -> ['a','b','c']  -> toCharArray
		for(char c : str.toCharArray()) {
			charSet.add(c);
			if(charSet.size()>3) {
				return false;
			}
		}
		
		return charSet.size()==3;
	}

}
