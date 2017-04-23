package easy1_50;

public class s_50_myPow {
	
	public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0) return 1.0/(myPow(x, 0-n));
        else {
            double res = x;
            for(int i = 1; i <= n;) {
                if(2*i <= n) {res *= res; i *= 2;}
                else{res  *= x; i++;}
            }
            return res;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myPow(3.0,2));
	}

}
