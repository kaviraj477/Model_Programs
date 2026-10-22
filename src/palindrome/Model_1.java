package palindrome;

public class Model_1 {
	
	public static void main (String [] args) {
		
		int num = 143341;
		int temp = num;
		int rev = 0;
		
		while (num>0) {
			
			int num2 = num%10;    // gets the remainder (eg. 143341 >> num2 = 1)
			rev = (rev*10)+num2;  // assigns the new value in rev; 
			num/= 10;             // gets the quotient value (eg. num = 14334)
			
			
			
		}
		System.out.println(rev);	
		if (rev == temp) {
			System.out.println(rev +" : the number is a palindrome");
		}
		else {
			System.out.println(rev+ ": the number is not a palindrome");
		}
	}

}
