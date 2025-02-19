package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniquqIds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] ids = new int[n];
		
		for(int i=0;i<n;i++) {
			
			ids[i]=sc.nextInt();
			
		}
		
		// Create a HashMap to count the occurrence of each ID
		Map<Integer, Integer> idcount = new HashMap<Integer, Integer>();
		for(int id : ids) { // 1 1 11 12
			idcount.put(id, idcount.getOrDefault(id, 0)+ 1); // 1 -> 1 // 11 -> 0 // 12 -> 0 
		}
		
		boolean foundcommonid=false;
		for(Map.Entry<Integer, Integer> entry : idcount.entrySet()) {
			
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+ " ");
				foundcommonid=true;
			}
		}
		
		if(!foundcommonid) {
			System.out.println("-1");
		}
		
		
	}

}
