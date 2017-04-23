package easy51_100;

public class ClimbingStairs_70 {
	public static long climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        long total = 0, total1 = 2, total2 = 1;;
        for (int i = 3; i <= n; i++)
        {
        	
        	total = total1 + total2;
        	total2 = total1;
        	total1 = total;
        }
       
        	//return climbStairs(n - 1) + climbStairs(n - 2);
		return total;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(100));

		System.out.println(null == null);
	}

}
