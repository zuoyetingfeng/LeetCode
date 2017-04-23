package easy1_50;

public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums) {
	    int i = nums.length > 0 ? 1 : 0;
	    for (int n : nums)
	        if (n > nums[i-1])
	            nums[i++] = n;
	    return i;
	    }

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = {1,2,2,2,2,3,4,5,5,6,7,8,8,9};
		System.out.println(removeDuplicates(nums));
	}

}
