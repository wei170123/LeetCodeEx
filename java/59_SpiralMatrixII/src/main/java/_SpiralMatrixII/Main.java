package _SpiralMatrixII;

public class Main {

	public static void main(String[] args) {
		int n = 3;

		int[][] ret = new int[n][n];
		int up = 0;
		int down = n - 1;
		int left = 0;
		int right = n - 1;
		int num = 1;
		while (true) {
			for (int index = left; index <= right; index++)
				ret[up][index] = num++;
			if (++up > down) {
				System.out.println(ret);
//				return ret;
			}
			
			for (int index = up; index <= down; index++)
				ret[index][right] = num++;
			if (--right < left) {
				System.out.println(ret);
//				return ret;
			}
				
			for (int index = right; index >= left; index--)
				ret[down][index] = num++;
			if (--down < up) {
				System.out.println(ret);
//				return ret;
			}
				
			for (int index = down; index >= up; index--)
				ret[index][left] = num++;
			if (++left > right) {
				System.out.println(ret);
//				return ret;
			}
		}
	}

}
