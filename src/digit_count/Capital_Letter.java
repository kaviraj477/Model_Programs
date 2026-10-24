package digit_count;

public class Capital_Letter {
	
	public static void main (String [] args) {
		
		
		String s1 = "odyssey tenet opppenheimer interstellar";
		String s2 = "";
		
		String[] s3 = s1.split(" ");
		
		
		for (String s4 : s3) {
			char   c1 = s4.charAt(0);
			char   c2 = Character.toUpperCase(c1);
			String s5 = s4.substring(1);
			       s2 = s2+c2+s5+ " ";
			
		}
		
		System.out.println(s2);
		
	}

}
