package main;

public class _2_Iterate_String {
	public static void main(String[] args) {
			
		String given_Word = "Hello";
		
// 1. Using toCharArray : -------------------------------
		String finalWord = "";
		for (char ch : given_Word.toCharArray()) {
			finalWord = ch + finalWord;
		}
		System.out.println(finalWord);
	}
}
