package digit_count;

public class Revese_String {
	
	public static void main (String [] args) {
	
	String s1 = "Welcome to the World";
	String s2 = "";
	String[] s3 = s1.split(" ");
	
	for (String s4 : s3) {
		String s5 ="";
		
		for (int i=s4.length()-1; i>=0;  i--) {
		
			
			char c1 = s4.charAt(i);
			s5 = s5+c1;
			
			
			
		}
     
       // s2 =s2+s5+" ";
        s2 = s5 + " "+ s2;
		
	}
	
    System.out.println(s2);
}
}