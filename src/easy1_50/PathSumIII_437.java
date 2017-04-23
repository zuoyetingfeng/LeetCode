/**
³­µÄtop one
*/

package easy1_50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class PathSumIII_437 {
	class TreeNode{
		 Integer val;
		 TreeNode left, right;
	 }
	
public int pathSum(TreeNode root, int sum) {
        
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        return helper(root, 0, sum, preSum);
        
    }
    public int helper(TreeNode root, int sum, int target, HashMap<Integer, Integer> preSum){
        if (root == null){
            return 0;
        }
        
        sum = sum + root.val;
        int res = preSum.getOrDefault(sum - target, 0);
        preSum.put(sum,preSum.getOrDefault(sum, 0) + 1);
        res = res + helper(root.left, sum, target, preSum) + helper(root.right, sum, target, preSum);
        preSum.put(sum, preSum.get(sum) - 1);
        return res;
    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
