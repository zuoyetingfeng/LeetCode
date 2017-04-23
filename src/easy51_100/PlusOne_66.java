package easy51_100;

public class PlusOne_66 {
	
	public static int[] plusOne(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    System.out.println(newNumber + "$$$");
	    newNumber[0] = 1;
	    System.out.println(newNumber + "@@@");
	    
	    return newNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,9,8,9,};
		a = plusOne(a);
		for (int n : a)
		System.out.println(n);
	}

}
