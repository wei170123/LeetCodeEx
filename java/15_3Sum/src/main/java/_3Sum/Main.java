package _3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-1, 0, 1, 2, -1, -4};
		//-4 -1 -1 0 1 2 
		
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.sort(list);
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int sumCounter = 0;
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			
			int j = i + 1;
			int k = nums.length - 1;
			while(j != k) {
				if(sum + nums[j] + nums[k] > 0) {
					k--;
					continue;
				}
				else if(sum + nums[j] + nums[k] < 0) {
					j++;
					continue;
				}
				else {
					List<Integer> ans = new ArrayList<Integer>();
					ans.add(nums[i]);
					ans.add(nums[j]);
					ans.add(nums[k]);
				}
			}
		}
		
		System.out.println(result);
//		return result;
	}

}
