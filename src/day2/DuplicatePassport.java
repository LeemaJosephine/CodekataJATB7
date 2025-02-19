package day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicatePassport {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		// Length of the array
		int n = sc.nextInt();
		
		// Create the array
		
		String[] passports = new String[n];
		
		// Elements of the array
		
		for(int i=0;i<n;i++) {
			
			passports[i]=sc.next();
		}
		
		
		HashSet<String> unique = new HashSet<String>();
		
		// converting array to set
		
		for(int i=0;i< n;i++) {
			
			unique.add(passports[i]);
		}
		
		// For-each to iterate the set and print in console
		for(String pass : unique) {
			
			System.out.print(pass+" ");
		}
		
	}

}
