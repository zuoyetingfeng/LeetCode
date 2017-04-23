package easy1_50;

public class CountandSay_38 {
	public static String countAndSay(int n) {
		if ( n== 0) return null;
		if ( n== 1) return "1";
		Integer nn = n;
		String olds = "1";
		System.out.println(olds.charAt(0));
		String news = new String();
		
		
		for (int j = 1; j < n; j++)
		{
			Integer tmp =  olds.charAt(0) - '0';
			Integer count = 1;
			for (int i = 1; i < olds.length() + 1; i ++)
			{
				
				
				if (i < olds.length() && olds.charAt(i) != olds.charAt(i - 1)) 
				{
					news = news + count.toString() + tmp.toString();
					tmp = olds.charAt(i) - '0';
					count = 1;
					//System.out.println(news + "one");
				}
				
				else if (i < olds.length() && olds.charAt(i) == olds.charAt(i - 1)) {count++;}
				else if (i >= olds.length() - 1) 
				{news = news + count.toString() + tmp.toString();}
				//System.out.println(count);
			}
			olds = news;
			news = "";
			System.out.println(olds + "here");
		}
		
		
		
		
		return olds;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String old = countAndSay(3);
		System.out.println(old);
		

	}

}



//if (n == 0) return null;
//String olds = "88";
//char c = (char) ('0' + n);;
////olds = olds + c;
//if (n == 1) return "n";
//
//System.out.println(olds);
//String news = "";
//int i = 1, j = 1;
//Integer tmp = 0, count = 0;
//
//for(j = 1; j < n; j++)
//{
//	tmp = olds.charAt(0) - '0';count = 1;
//	for(i = 1; i < olds.length() + 5 ; i++)
//	{
////		i == olds.length() - 1 ||
//		if ( i >= olds.length() - 1) 
//		{
//			news = news + count.toString() + tmp.toString();
//			System.out.println(news );
//			break;
//		}
//				
//		else if (olds.charAt(i) != olds.charAt(i - 1))
//		{
//			news = news + count.toString() + tmp.toString();
//			System.out.println(news);
//			//break;
//		}
//		else if (olds.charAt(i) == olds.charAt(i - 1)) {count++;}
//		
//	}
//	olds = news;
//}