package digit_count;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_array {
	
	public static void main (String [] args) {
		
		//int a [] = {20,30,25,20,26,24,28,27,28,25,35,62,65,65,70};
		
		int [] a = new int [5];
		
		a [0]= 20;
		a [1]= 30;
		a [2]= 20;
		a [3]= 10;
		a [4]= 30;
		
		
		
		
		Set <Integer> s1 = new HashSet<>();
		
		for (int i =0; i<a.length; i++) {
			s1.add(a[i]);	
		}
		
		for (int i2 :s1) {
			System.out.println(i2);
		}
	}

}
