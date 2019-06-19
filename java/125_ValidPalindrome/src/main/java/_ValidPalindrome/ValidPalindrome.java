package _ValidPalindrome;

import java.util.Scanner;

public class ValidPalindrome {

	/**
	 * 不取代非字母字元，直接略過
	 * char 比大小
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入");

		String palindrome = scanner.nextLine();

		System.out.println("輸入為:" + palindrome);

		scanner.close();

		palindrome = palindrome.toLowerCase();

		int i = 0;
		int size = palindrome.length() - 1;

		while (i < size) {
			while(i < size && !((palindrome.charAt(i) >= 'a' && palindrome.charAt(i) <= 'z') || (palindrome.charAt(i) >= '0' && palindrome.charAt(i) <= '9'))) {
				i++;
			}
			while(i < size && !((palindrome.charAt(size) >= 'a' && palindrome.charAt(size) <= 'z') || (palindrome.charAt(size) >= '0' && palindrome.charAt(size) <= '9'))) {
				size--;
			}
			
			if (palindrome.charAt(i) != palindrome.charAt(size)) {
				System.out.println("結果為:False");
//				return false;
			}
			i++;
            size--;
		}
		System.out.println("結果為:True");
//		return true;

		return;
	}

}
