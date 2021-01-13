package InterviewCoding;

public class CountAndSay {

	public static void main(String[] args) {
		
		System.out.println(countAndSay(10));

	}

	private static String countAndSay(int n) {
		
		String out = "1";
		while(--n != 0) {
			System.out.println(n);
			int count = 1;
			String newOut = "";
			int i ;
			for( i = 0;i < out.length() - 1;i++) {
				if(out.charAt(i) != out.charAt(i + 1)) {
					newOut += Integer.toString(count) + out.charAt(i);
					count = 1;
				}
				else {
					count++;
				}
			}
			if(count != 0) {
				newOut += Integer.toString(count) + out.charAt(i);
			}
		out = newOut;			
		}
		return out;
	}

}
