package day3;

import java.util.Scanner;

public class PatternProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
				
				for(int j=1; j <= n + 1 -i; j++) {
					System.out.print(j);
				}
			} else {
				
				for(int j=n+1-i; j > 0 ; j --) {
					System.out.print(j);
				}
			}
			
			System.out.println();
		}
	}

}
