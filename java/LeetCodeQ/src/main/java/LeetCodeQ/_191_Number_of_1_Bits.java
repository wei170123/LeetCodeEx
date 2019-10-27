package LeetCodeQ;

public class _191_Number_of_1_Bits {

	public static void main(String[] args) {
		Integer n = 15;
		// 00000000 00000000 00000000 00001111
		
		int result = 0;
		for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1; 
//			System.out.println(n >>> 1);
        }
		
		System.out.println(result);
	}

}
