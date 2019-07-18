package _GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		List<String> result = new ArrayList<>();
		char[] current = new char[n * 2];
		current[0] = '(';
		helper(result, 1, current, n - 1, 1);

		System.out.println(result);
		// return result;
	}

	public static void helper(List<String> result, int index, char[] current, int n, int balance) {
		if (index == current.length) {
			result.add(new String(current));
			return;
		}

		if (n != 0) {
			current[index] = '(';
			helper(result, index + 1, current, n - 1, balance + 1);
		}
		if (balance != 0) {
			current[index] = ')';
			helper(result, index + 1, current, n, balance - 1);
		}
	}

}
