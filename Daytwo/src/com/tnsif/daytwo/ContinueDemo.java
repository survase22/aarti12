package com.tnsif.daytwo;

public class ContinueDemo {
	public static void main(String[] args) {

		for (int k=6; k<20; k++)
		{
			//odd no are skipped
			
			if (k%2 !=0)
				continue;
			//Even number are printed 
			System.out.println(k + "");
		}
		
	}


}
