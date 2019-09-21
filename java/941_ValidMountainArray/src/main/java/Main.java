
public class Main {

	public static void main(String[] args) {
		int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
		
		int i = 0;
		int length = A.length;
		int s1 = 0;
		int s2 = 0;
		
		if(length < 2 || (A[0] > A[1])) {
			System.out.println(false);
//			return false;
		}
		if(A[length - 1] > A[length - 2]) {
			System.out.println(false);
//			return false;
		}
		
		while(i + 1 < A.length) {
			
			if(A[i] >= A[i+1]) {
				s1 = i;
				break;
			}
			i++;
		}
		
		while(length - 1 > 0) {
			
			if(A[length - 1] >= A[length - 2]) {
				s2 = length - 1;
				break;
			}
			length--;
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1 == s2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
