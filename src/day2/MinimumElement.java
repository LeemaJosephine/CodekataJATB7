package day2;

import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		//Find the minimum element
		int min = arr[0]; // Assume the first element is the minimum
		for(int i=0;i<n;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}

}
