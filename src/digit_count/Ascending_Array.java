package digit_count;

public class Ascending_Array {
	
	public static void main (String [] args) {
		int [] in = new int [6];
		
		in [0]= 500;
		in [1]= 200;
		in [2]= 75;
		in [3]= 18;
		in [4]= 69;
		in [5]= 800;
		
		for (int i=0; i<in.length; i++) {
			
			for (int j= i+1 ; j<in.length; j++) {
				
				if (in[i]>in[j]) {
					
					int temp = in[i];
					in [i]= in[j];
					in [j] = temp;
				
					
				}
				
			}
			
			
		}
		
		for (int i =0; i<in.length; i++) {
			System.out.println(in[i]);
		}
		
		
	}

}
