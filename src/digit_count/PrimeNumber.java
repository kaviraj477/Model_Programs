package digit_count;

public class PrimeNumber {
	
	public static void main (String_reverse [] args) {
		
		
		int a = 23;
		int count = 0;
		
		for (int i = 2; i<=a/2; i++) {
			
			if (a%i==0) {  // for a prime number, the remainder will never be 0
				count++;
				
			}
		}
			if (count==0) {
				System.out.println("the number is prime number");
			}
			
			else {
				System.out.println("the number is not a prime number");
				
			}
		}
	}


