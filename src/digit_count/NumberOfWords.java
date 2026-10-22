package digit_count;

import java.util.ArrayList;
import java.util.List;

public class NumberOfWords {
	
	public static void main (String [] args) {
		
		
		String s = "Welome to the new class";
		String[] s2 = s.split(" "); // it chops the single line into multiple on each spacing
		
	
		for (String ss : s2) { // to understand how it is chopped we printed in a forloop
			System.out.println(ss);
		}
		
        int a = s2.length;
        System.out.println("number of words is : "+a);
	}

}
