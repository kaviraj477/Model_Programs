package digit_count;

public class Factorial {
	
	public static void main (String_reverse [] args) {
		
		int a = 6;
		int temp =a;
		int fact = 1;
		
		while (a>0) {
			fact = fact*a;
			a-=1; //a = a-1; --> shortcut
			
		}
		System.out.println("the factorial of "+ temp + " is : "+ fact);
	}

}
