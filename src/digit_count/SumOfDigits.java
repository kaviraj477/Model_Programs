package digit_count;

public class SumOfDigits {
	
	public static void main (String_reverse [] args) {
		
		int i = 58792;
	
		int sum = 0;
		
		while (i>0) {
			
			int i2 = i%10;
			sum = sum+i2;
			i/=10;
		}
		System.out.println("the sum of the digits are " +sum );
		
	}

}
