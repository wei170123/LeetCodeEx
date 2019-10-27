package LeetCodeQ;

public class _190_Reverse_Bits {

	public static void main(String[] args) {
		
		// 00000010100101000001111010011100 字串反轉
		// 00111001011110000010100101000000
		Integer n = 43261596;
		
		int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // 无符号右移，忽略符号位，空位都以0补齐
            if (i < 31) // 最后一次不需要进行位移
                result <<= 1;
        }
//        return result;
		System.out.println(result);
	}

}
