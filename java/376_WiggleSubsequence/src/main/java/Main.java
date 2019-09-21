
public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };

		if (nums.length == 0) {
			// return 0;
		}

		int n = nums.length;
		int i = 1;
		int prev = nums[0];
		int count = 1;
		while (i < n) {
			if (nums[i] > prev) {
				while (i + 1 < n && nums[i + 1] >= nums[i])
					i++;
			} else {
				while (i + 1 < n && nums[i + 1] <= nums[i])
					i++;
			}

			if (nums[i] != prev) {
				count++;
				prev = nums[i];
			}
			i++;
		}

		// return count;
	}

}
