package easy51_100;

public class LengthofLastWord_58 {
	public static int lengthOfLastWord(String s) {
        int N = s.length();
        if (N == 0) return 0;
        while (s.charAt(s.length() - 1) == ' ') {
            if (s.length() <= 1) return 0;
            s = s.substring(0, s.length() - 1);
        }
        //int hi = s.length() - 1, lo = 0;
        int hi = s.lastIndexOf(' ');
        if (hi == -1) return s.length();
        return s.length()  - hi;
    }
	
	public static void main(String[] args) {
		
		String s = "12 3 ";
		
		System.out.println(lengthOfLastWord(s));
		//System.out.println(s.lastIndexOf(' '));
		s = s.substring(0, 2);
		System.out.println(s);
	}

}
