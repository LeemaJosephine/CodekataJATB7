package day3;

import java.util.Scanner;

public class StringWeightage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int weight=0;
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			weight += (int) c; // type casting to int to get the ASCII value 
		}
		
		System.out.println(weight);
	}

}
