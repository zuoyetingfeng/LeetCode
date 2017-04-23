/**
 * myAtoi1 47.9%
 * */

/**
 * myAtoi2 75.44%
 * */
package easy1_50;

public class StringtoInteger_8 {
	
	public static int myAtoi2(String str) {
        
		 int index = 0,sign = 1,digit = 0,total = 0;
		 //long newtotal = 0;
		 if(str.length() == 0) return 0;
		 while(str.charAt(index) == ' ')
		 {
			 index ++;
		 }
		 while (str.charAt(index) == '+' || str.charAt(index) == '-')
		 {
			 sign = str.charAt(index) == '+' ? 1 : -1;
			 index ++;
		 }
		 
		 while (index < str.length())
		 {
			 //int digit = 0;
			 if (str.charAt(index) < '0' || str.charAt(index) > '9') break;
			 digit = str.charAt(index) - '0';
			 if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
		            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

		        total = 10 * total + digit;
			
			 index ++;
			 
		 }
		 return sign*total;
	   
	 }
	
	 public static int myAtoi1(String str) {
	        
		 int index = 0,sign = 1,digit = 0,total = 0;
		 long newtotal = 0;
		 if(str.length() == 0) return 0;
		 while(str.charAt(index) == ' ')
		 {
			 index ++;
		 }
		 while (str.charAt(index) == '+' || str.charAt(index) == '-')
		 {
			 sign = str.charAt(index) == '+' ? 1 : -1;
			 index ++;
		 }
		 
		 while (index < str.length())
		 {
			 //int digit = 0;
			 if (str.charAt(index) < '0' || str.charAt(index) > '9') break;
			 digit = str.charAt(index) - '0';
			// newtotal = 10 * total + digit;
//			 if ((newtotal - digit) / 10 != total) 
//			 {
//				 return sign == 1 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
//			 }
			 newtotal = 10 * newtotal + digit; 
			 if (newtotal > 2147483647) 
				 return sign == 1 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
			 //total = (int) newtotal;
			 index ++;
			 
		 }
		 return sign*(int) newtotal;
	   
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = myAtoi2("    105225433354");
//		10522545459
//		1932610867
//		2147483647
		System.out.println(j);

	}

}
