package _ClimbingStairs;

public class Main {

	public static void main(String[] args) {
		int n = 45;
		
		if (n <= 0) {
//			return 0;
		}


		int[] arr = new int[n + 1];

		arr[0] = 1;
		int i = 1;

		for (i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + (i - 2 < 0 ? 0 : arr[i - 2]);
		}

//		return arr[i - 1];
		System.out.println(arr[i - 1]);
	}

	// ***Time Limit Exceeded***
	// public static void main(String[] args) {
	// int n = 44;
	// System.out.println(add(n, 0));
	// // return add(n, 0);
	// }
	//
	// public static int add(int n, int now) {
	// if (now == n) {
	// return 1;
	// } else if (now > n) {
	// return 0;
	// }
	// return add(n, now + 1) + add(n, now + 2);
	// }
}
