package digit_count;

public class String_reverse {
	
	public static void main (String [] args) {
		
		String s = "madam";
		String rev = "";
		
		String temp = s;
		
		for (int i = s.length()-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);
		
		if (temp.equals(rev)) {  // for string we use .equals() ; for int (==)
			System.out.println("the given word is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

}
