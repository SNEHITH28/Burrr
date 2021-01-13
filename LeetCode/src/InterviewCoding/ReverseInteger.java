package InterviewCoding;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int n = 1534236469;
		System.out.println(reverse(n));

	}

	private static int reverse(int x) {
		long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
	}

}
