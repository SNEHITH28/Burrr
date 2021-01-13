package InterviewCoding;


import java.util.Arrays;
import java.util.Scanner;

public class LongNumberPossibilites {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int input1 = s.nextInt();
		int input2 = s.nextInt();
		int input3[] = new int[input1];
		
		Arrays.sort(input3);
		int res = 0;
		for(int i = input1 - 1;i >= (input1 - input2);i--) {
			res += input3[i];
		}
		System.out.println(res);
	}
}
