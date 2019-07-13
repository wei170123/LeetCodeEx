package _IntersectionofTwoArrays2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		
		List<Integer> result = new ArrayList<Integer>();
		
		Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
		
		int i = 0;
		while(i < nums1.length) {
			if(tmp.get(nums1[i]) != null) {
				tmp.put(nums1[i], tmp.get(nums1[i]) + 1);
			}
			else {
				tmp.put(nums1[i], 1);
			}
			
			i++;
		}
		
		int j = 0;
		while(j < nums2.length) {
			if(tmp.get(nums2[j]) != null && tmp.get(nums2[j]) > 0) {
				result.add(nums2[j]);
				tmp.put(nums2[j], tmp.get(nums2[j]) - 1);
			}
			j++;
		}
		
		int[] resultArr = new int[result.size()];
		int counter = 0;
		
		Collections.sort(result);
		System.out.println(result);
		for(Integer num : result) {
			resultArr[counter] = num;
			counter++;
		}
		
		System.out.println(resultArr);
//		return resultArr;
	}

}
