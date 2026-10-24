package digit_count;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Remove_duplicate {

	
	public static void main (String [] args) {
		
		String s = "Welcome paper tree rubber";
		String s2 = s.replace(" ", "");
		String s3 = "";
		
		char [] c1 = s2.toCharArray();
		
		Map <Character, Integer> mp = new LinkedHashMap <Character, Integer>();
		
		for (int i=0; i<c1.length; i++) {
			
			if (mp.containsKey(i)) {
				
			}
			else {
				mp.put(c1[i], 1);
			}
			
		}
		
		Set <Entry<Character, Integer>> ent  = mp.entrySet();
		for (Entry<Character, Integer>ent2 : ent) {
			s3 = s3+ ent2.getKey();
			
		}
		System.out.println(s3);
	
		
	}
	
	
	
}
