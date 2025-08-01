package main;

import java.util.Arrays;

public class _3_Array_CodingProblems {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 3, 4, 5 };
		
//  1. Sum of all elements in Array : -------------------------------------------------
		
		// Using Streams : 
		int stream_Sum = Arrays.stream(numbers).sum();
		System.out.println("Sum using Stream : " + stream_Sum);
		
		// Normal Loop : 
		int sum = 0;
		for(int i : numbers) {
			sum = sum + i;
		}
		System.out.println("Sum using loop : " + sum);
		System.out.println("----------------------------------");
		
//  2. Average of all elements in Array : -------------------------------------------------
		
		// Using Streams : 
		double stream_Avg = Arrays.stream(numbers).average().getAsDouble();
		System.out.println("Avg using Stream : " + stream_Avg);
		
		// Normal Loop : 
		int sum1 = 0;
		double avg = 0;
		for(int i : numbers) {
			sum1 = sum1 + i;  //calculate sum of all elements
		}
		avg = (double) sum1 / numbers.length; //divide sum by total elements
		System.out.println("Avg using loop : " + avg);
		System.out.println("----------------------------------");
		
//  3. Smallest/Biggest element in Array : -------------------------------------------------
		
		// Using Streams : 
		int stream_minNum = Arrays.stream(numbers).min().getAsInt();
		System.out.println("Min num using stream : " + stream_minNum); // Min number
		
		int stream_maxNum = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Max num using stream : " + stream_maxNum); // Max number
		
		// Normal Way : 
		 Arrays.sort(numbers); //sort to make in ascending
		 System.out.println("Min num using normal way : " +  numbers[0]); // Min number
		 System.out.println("Max num using normal way : " +  numbers[numbers.length - 1]); // Max number
		 System.out.println("----------------------------------");
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
