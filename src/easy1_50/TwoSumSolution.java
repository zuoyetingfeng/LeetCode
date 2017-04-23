package easy1_50;
//Your runtime beats 68.9% of java submissions.

import java.util.HashMap;

public class TwoSumSolution {

	public int[] twoSum(int[] nums, int target) {
        
//		int[] a = {0,0};
//		HashMap hm = new HashMap();
//		for (Integer i = 0; i < nums.length; i++)
//			hm.put(nums[i], i);
//        for (Integer i =0; i < nums.length - 1;  i++)
//        	if(hm.get(target - nums[i]) != null) 
//        	{ 
//        		//System.out.println(hm.get(9 - nums[i]));
//        		a[0] = i; 
//        		a[1] = (int) hm.get(target - nums[i]);
//        		return a;
//        	}
//		
//        return null;
		
		
		int[] a = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0,j = 0; i < nums.length; i++)
		{
			if(hm.containsKey(target - nums[i])) 
        	{ 
        		//System.out.println(hm.get(9 - nums[i]));
        		a[0] = i; 
        		a[1] = (int) hm.get(target - nums[i]);
        		return a;
        	}
			
			 hm.put(nums[i], i);
		}
			
		
			
//        for (Integer i =0; i < nums.length - 1;  i++)
//        	if(hm.containsKey(target - nums[i])&& hm.get(target - nums[i]) != i) 
//        	{ 
//        		//System.out.println(hm.get(9 - nums[i]));
//        		a[0] = i; 
//        		a[1] = (int) hm.get(target - nums[i]);
//        		return a;
//        	}
		
        return null;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,3,2,4};
		int target = 6;
		TwoSumSolution tss = new TwoSumSolution();
		int[] t = tss.twoSum(a, target);
		System.out.println(t[0] + "" + t[1]);
	}

}




//public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        
//        int[] a = {0,0};
//		HashMap hm = new HashMap();
//		for (Integer i = 0,j = 0; i < nums.length; i++)
//			 hm.put(nums[i], i);
//		
//			
//        for (Integer i =0; i < nums.length - 1;  i++)
//        	if(hm.containsKey(target - nums[i])&& hm.get(target - nums[i]) != i) 
//        	{ 
//        		//System.out.println(hm.get(9 - nums[i]));
//        		a[0] = i; 
//        		a[1] = (int) hm.get(target - nums[i]);
//        		return a;
//        	}
//		
//        return null;
//    }
//}