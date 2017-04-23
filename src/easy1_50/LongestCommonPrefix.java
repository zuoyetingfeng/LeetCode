package easy1_50;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        
		int N = strs.length;
		if (strs.length == 0 || strs == null) return null;
		String pre = strs[0];
		for(int i = 1; i < N; i++)
		{
			while(strs[i].indexOf(pre) == -1) pre = pre.substring(0, pre.length() - 1);
			
			
		}
		return pre;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		s = s + '2';
		
		System.out.println();
	}

}
