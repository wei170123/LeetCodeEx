package LeetCodeQ;


public class _33_SearchRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {};
		int target = 0;
//		nums = [4,5,6,7,0,1,2], target = 3
		
		if(nums == null || nums.length == 0) {
//			return -1;			
		}

        int l = 0, r = nums.length-1;
		
        while(l <= r){
        	// 中位 index
            int p = l + (r-l)/2;
            if(target == nums[p]) {
//            	return p;
            }

            // check 最後一位
            if(l == r) {
//            	return target == nums[l] ? l: -1;
            }
            
         // check 倒數第二位
            if(r-l == 1) {
//            	return target == nums[l] ? l : (target == nums[r] ? r : -1);
            }
            else if(nums[p] > nums[l]){
                if(target >= nums[l] && target < nums[p]) r = p-1;
                else l = p+1;
            } else {
                if(target > nums[p] && target <= nums[r]) l = p+1;
                else r = p-1;
            }
        }
        
//        return -1;
	}

}