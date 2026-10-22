package digit_count;

public class Vowel_Count {
	
	public static void main (String [] args) {
		
		String s = "pseudomonas";
	   char[] ch = s.toCharArray();
	   int count = 0;
		 
		 for (int i=0; i<ch.length; i++) {
			 
			 char c = ch[i];
			 if (c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				 System.out.println("vowel letters are : "+ c);
				 count++;
			 }
			 
	}
 
		 System.out.println ("number of vowels is : "+count);
}
}