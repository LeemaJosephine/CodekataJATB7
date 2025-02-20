package day3;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int type=sc.nextInt();
		int pos=sc.nextInt();
		
		System.out.println(performConversion(str,type,pos));
	}

	private static String performConversion(String str, int type, int pos) {
		// TODO Auto-generated method stub
		//StringBuilder result = new StringBuilder();
		String result="";
		// 3 -> 3 6 9 
		// 2 -> 2 4 6 8
		// 5 -> 5 10 15
		for(int i=0;i< str.length();i++) {
			char c = str.charAt(i);
			if((i +1) % pos == 0) { // checking for multiple
				
				// perfrom conversion
				if(type==1) {
					result = result + Character.toLowerCase(c);
				} else if(type == 2){
					result = result + Character.toUpperCase(c);
				} 
			} else {
					result = result + c; // if it's not multiple keep it as it is
			}
			
		}
		
		return result;
	}

}
