package day3;

import java.util.Scanner;

public class CarEngineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(calculateEngineNumber(str));
	}

	private static int calculateEngineNumber(String str) {
		// TODO Auto-generated method stub
		
		int enginenumber=0;
		for(int i=0;i<str.length();i++){
			
			char c =str.charAt(i);
			if(Character.isDigit(c)) {
				enginenumber += Character.getNumericValue(c); 
			}
		}
		return enginenumber;
	}

}
