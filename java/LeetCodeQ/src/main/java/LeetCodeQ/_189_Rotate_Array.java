package LeetCodeQ;

public class _189_Rotate_Array {

	// 由于旋转数组的操作也可以看做从数组的末尾取k个数组放入数组的开头
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		// [5,6,7,1,2,3,4]

		if (nums == null || (k %= nums.length) == 0) return;
		
		int start = 0;
		int idx = 0;
		int pre = 0;
		int cur = nums[0];
		int n = nums.length;
		
		for (int i = 0; i < n; ++i) {
			pre = cur;
			idx = (idx + k) % n;
			cur = nums[idx];
			nums[idx] = pre;
			if (idx == start) {
				idx = ++start;
				cur = nums[idx];
			}
		}
	}

}
