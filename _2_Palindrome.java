package main;

public class _2_Palindrome {
	public static void main(String[] args) {
			
		String given_Word = "Hello";
		
// 1. Using toCharArray : -------------------------------
		String finalWord = "";
		for (char ch : given_Word.toCharArray()) {
			finalWord = ch + finalWord;
		}
		System.out.println(finalWord);

// 2. Using StringBuilder : (Filter Palindrome Words) -----------------------------
		List<String> words = Arrays.asList("Radar", "Hello", "Deified", "Madam", "Java");
		List<String> isPalindrome = new ArrayList<>();
		
		for(String word : words) {
			String reversed = new StringBuilder(word.toLowerCase()).reverse().toString();
			if(word.toLowerCase().equals(reversed)) {
				isPalindrome.add(word);
			}
		}
		System.out.println(isPalindrome);
	}
}
