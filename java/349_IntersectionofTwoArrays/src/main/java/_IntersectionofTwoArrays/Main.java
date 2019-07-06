package _IntersectionofTwoArrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		
		Set<Integer> result = new HashSet<Integer>();
		
		Map<Integer, Boolean> tmp = new HashMap<Integer, Boolean>();
		
		int i = 0;
		while(i < nums1.length) {
			tmp.put(nums1[i], false);
			i++;
		}
		
		int j = 0;
		while(j < nums2.length) {
			if(tmp.get(nums2[j]) != null) {
				result.add(nums2[j]);
			}
			j++;
		}
		
		int[] resultArr = new int[result.size()];
		int counter = 0;
		for(Integer num : result) {
			resultArr[counter] = num;
			counter++;
		}
		
		System.out.println(resultArr);
//		return resultArr;
	}

}
