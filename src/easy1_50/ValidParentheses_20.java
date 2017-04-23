/**
 * 5.52%
 * */

package easy1_50;

import java.util.Stack;

public class ValidParentheses_20 {
	public static boolean isValid(String s) {
		int N = s.length();
        if (N < 2) return false;
        if (N % 2 != 0) return false;
        char[] sc = s.toCharArray();
        for (int i = 0; i < N/2; i++)
        	
//		
//		int N = s.length();
//		if (N < 2) return false;
//        
//		
//		Stack<Character> stack= new Stack<Character>();
//		
//		for(int i = 0; i < N; i++)
//		{
//			if (s.charAt(i) == '{' ||s.charAt(i) == '['||s.charAt(i) == '(')
//				stack.push(s.charAt(i));
//			if (s.charAt(i) == '}') 
//			{
//				if (stack.isEmpty()) return false;
//				else if (stack.pop() != '{') return false;
//			}
//			else if (s.charAt(i) == ']') 
//			{
//			    if (stack.isEmpty()) return false;
//				else if (stack.pop() != '[') return false;
//			}
//			else if (s.charAt(i) == ')') 
//			{
//			    if (stack.isEmpty()) return false;
//				else if (stack.pop() != '(') return false;
//			}
//		}
//		if(!stack.isEmpty()) return false;
//		return true;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isValid("{[((})]}"));
		System.out.println();
		
	}

}
