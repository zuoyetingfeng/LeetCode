package easy1_50;

public class ZigZagConversion_6 {
	
public static String convert(String s, int numRows) {
	
	if (numRows == 1) return s;
	else 
	{
		char[] sc = s.toCharArray(); 
		StringBuilder[] ss = new StringBuilder[numRows]; 
		String sx = "";
		for (int j = 0; j < numRows ; j++)
		{
			ss[j] = new StringBuilder();
		}
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < numRows; j++)
			{
				int n = 2*numRows-2;
				if (i % n == j) 
					ss[j].append(sc[i]);
				else if (i%n == n-j) ss[j] = ss[j].append(sc[i]);
			}
			
		}
		for (int j = 0; j < numRows ; j++)
		{
			sx = sx + ss[j].toString();
			System.out.println(ss[j].toString());
		}
		System.out.println(sx);
		
		return sx;
	}
	
	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		s = convert(s,3);
		System.out.println(s);
		//PAHNAPLSIIGYIR
		//PAHNAPLSIIGYIR

	}

}



//public String convert(String s, int numRows) {
//    if (numRows == 1) return s;
//else 
//{
//    char[] sc = 
//	StringBuilder[] ss = new StringBuilder[numRows]; 
//	String sx = "";
//	for (int j = 0; j < numRows ; j++)
//	{
//		ss[j] = new StringBuilder();
//	}
//	
//	for (int i = 0; i < s.length(); i++)
//	{
//		for (int j = 0; j < numRows; j++)
//		{
//			//ss[(i - j)%(numRows)] = ss[(i - j)%(numRows)].append(s.charAt(i));
//			int n = (2*numRows-2);
//			if (i % n == j) 
//				ss[j].append(s.charAt(i));
//			else if (i%n == n-j) ss[j] = ss[j].append(s.charAt(i));
//		}
//		
//	}
//	for (int j = 0; j < numRows ; j++)
//	{
//		sx = sx + ss[j].toString();
//		
//	}
//	//System.out.println(sx);
//	
//	return sx;
//}
