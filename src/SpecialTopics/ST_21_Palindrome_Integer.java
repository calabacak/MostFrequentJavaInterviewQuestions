package SpecialTopics;

public class ST_21_Palindrome_Integer {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(12165));

	}

	public static boolean isPalindrome(int num) {

		String str = String.valueOf(num);
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {//be careful about i--
			reversed = reversed + str.charAt(i);// be careful how to concatenate
		}
		if (reversed.equals(str)) {
			return true;
		} else
			return false;
	}
	public static boolean PisPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			return true;
		}
		return false;
	}

}
