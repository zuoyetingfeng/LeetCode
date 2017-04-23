/**
 * 41.28%
 * */

package easy1_50;

public class PalindromeNumber_9 {
	
	public static boolean isPalindrome(int x){
		
		
		if(x < 0 || x!=0 && x % 10 == 0) return false;
		int rev = 0;
		while(x > rev)
		{
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return (x == rev || x == rev / 10);
	}

	public static boolean isPalindrome1(int x) {
		char pre, lat;
		Integer xl = Math.abs(x);
		String s = xl.toString();
		int N = s.length();
		for (int i = 0; i < N/2; i++)
		{
			pre = s.charAt(i);
			lat = s.charAt(N - 1 -i);
			if (pre != lat) return false;
		}
		return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(1234321));
		
	}

}
