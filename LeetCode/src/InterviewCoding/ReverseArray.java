package InterviewCoding;

public class ReverseArray {
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		s = reverse(s);
		for(char c : s) {
			System.out.print(c +" ");
		}

	}

	private static char[] reverse(char[] s) {
		
		for(int i = 0;i < s.length;i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
		return s;
	}

}
