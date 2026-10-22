package digit_count;

public class PrimeNumbersList {
	
	
	public static void main (String_reverse [] args) {
		
		for (int i = 1; i<60; i++) {
			int count = 0;
			
			
			for (int j = 2; j<i/2; j++) {
				
				if (i%j==0) {
					
					count++;
				}
			}
			if (count == 0) {
				
				System.out.println("the prime numbers are : "+i);			}
		}
	
	}

}
