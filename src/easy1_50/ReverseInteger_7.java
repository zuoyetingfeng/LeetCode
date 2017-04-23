//reverse1  38.7%

/**
 reverse ³­µÄtop1*/

package easy1_50;

public class ReverseInteger_7 {
	
public static int reverse2(int x){
	
	int result = 0;
	while (x != 0)
	{
		int tail = x % 10;
		int newResult = tail + result * 10;
		if ((newResult - tail)/10 != result) return 0;
		result = newResult;
		x = x / 10;
	}
	return result;
}
public static int reverse1(int x) {
	
	if (x >= 0)
	{
		Integer xx= x;
		long xxx =0;
		String s = xx.toString();
		char[] tmp = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			
			//if (tmp[0]  > '0') {System.out.println(tmp[0]); return 0;}
			tmp[i] = s.charAt(s.length() - 1 - i);
			xxx += ((tmp[i] -'0')*Math.pow(10, s.length() - 1 - i));
			if (xxx > Math.pow(2, 31) - 1) return 0;
			
		}
		return (int) xxx;	
		
		
		
	}
		
		else 
		{
			Integer xx= -x;
			long xxx =0;
			String s = xx.toString();
			char[] tmp = new char[s.length()];
			for (int i = 0; i < s.length(); i++)
			{
			
				//if (tmp[0]  > '0') {System.out.println(tmp[0]); return 0;}
				tmp[i] = s.charAt(s.length() - 1 - i);
				xxx += ((tmp[i] -'0')*Math.pow(10, s.length() - 1 - i));
				if (xxx > Math.pow(2, 31)) return 0;
			
			}
			return (int) -xxx;	
		}
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = reverse2(-469);
		System.out.println(x);

	}

}
