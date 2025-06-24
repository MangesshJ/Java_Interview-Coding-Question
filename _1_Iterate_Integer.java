package main;

public class _1_Iterate_Integer {
	public static void main(String[] args) {
			
		int num = 123456;
		
		int get_last_Num = num % 10;  		// To take out last integer and use it.
		int without_last_Num = num / 10;	// Remove last num from integer
		
		System.out.println("Extracted last num : " + get_last_Num);
		System.out.println("Integer without last num : " + without_last_Num);
		
	}
}
