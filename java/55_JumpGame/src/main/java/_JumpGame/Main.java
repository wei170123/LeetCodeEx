package _JumpGame;

public class Main {

	public static void main(String[] args) {
		// Greedy algorithm
		int[] nums = {2,3,1,1,4};
		
		// can arrived position
		int arrivedIndex = nums[0];
		
		for(int i = 1; i < nums.length && arrivedIndex >= i ; i++) {
			// i = now position
			// i + nums[i] = can arrived position
			if(i + nums[i] > arrivedIndex) {
				arrivedIndex = i + nums[i];
			}
		}
//		return arrivedIndex >= (nums.length - 1) ? true : false;
	}

}
