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
		
		Arrays.sort(passports);
		
        System.out.print(passports[0]);
        for (int i = 1; i < n; i++) {
            if (!passports[i].equals(passports[i - 1])) { // !=
            	
            	System.out.print(" "+passports[i]);
            }
            
        }
        
          
		
//		HashSet<String> unique = new HashSet<String>();
//		
//		for(int i=0;i< n;i++) {
//			
//			unique.add(passports[i]);
//		}
//		
//		for(String pass : unique) {
//			
//			System.out.print(pass+" ");
//		}
		
	}

}
