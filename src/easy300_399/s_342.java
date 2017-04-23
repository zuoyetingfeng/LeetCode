package easy300_399;

public class s_342 {
	public static boolean isPowerOfFour(int num) {
        if(num == 1) return true;
        return(num > 0 && ((num & 3) == 0));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isPowerOfFour(8));
		System.out.println("-------");
	}

}
