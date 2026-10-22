package digit_count;

public class Count_1 {
	
	public static void main (String_reverse [] args) {
		
		int i = 543287;
		int count = 0;
		
		while (i>0) {
			count ++;
			i/=10;
			//i = i/10;
			
		}
		System.out.println("the number of digits = " + count);
		
	}

}
