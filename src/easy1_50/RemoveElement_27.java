/**
 * 39%
 * */

package easy1_50;

public class RemoveElement_27 {
	public static int removeElement(int[] nums, int val) {
        int N = nums.length;
        if (N < 1) return 0;
        if (N == 1) {if (nums[0] == val) return 0;else return 1;}
        int i = 0;
        for (int n : nums)
        	if (n != val) nums[i++] = n;
        return i;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,3};
		int a = removeElement(nums, 3);
		System.out.println(a);
		String str = "sdsdfghjfghfghndfcgvbfvvb";
		String sub = "sdfghjfg";
		str.indexOf(sub);
		
	}

}



//public static int removeElement(int[] nums, int val) {
//    int N = nums.length;
//    if (N < 1) return 0;
//    if (N == 1) {if (nums[0] == val) return 0;else return 1;}
//    int lo = 0, hi = N - 1;
//    while (lo < hi )
//    {
//        int tmp = 0;
//        while (nums[hi] == val && hi > 0) hi--;
//        while (nums[lo] != val && lo < N - 2) lo++;
//        if (lo < hi && lo < N - 1 && hi >= 0) {tmp = nums[lo]; nums[lo] = nums[hi]; nums[hi] = tmp;}
//        
//        
//    }
//    for(int i = 0; i < N; i++)
//    {
//    	System.out.println(nums[i]);
//    }
//    if (nums[0] == val) return 0;
//    return hi + 1;
//    
//}