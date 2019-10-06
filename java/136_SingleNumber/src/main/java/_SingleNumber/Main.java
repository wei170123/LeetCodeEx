package _SingleNumber;

public class Main {

	public static void main(String[] args) {
		/*
		 * XOR 應用
		 *  0 xor 0 = 0 
		 *  0 xor 1 = 1 
		 *  1 xor 0 = 1 
		 *  1 xor 1 = 0
		 */
		int[] nums = {};

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		// return result;
	}

}
