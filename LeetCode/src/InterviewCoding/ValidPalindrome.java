package InterviewCoding;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "abc 11 cba";
		String pal = "";
		for(int i = 0;i < s.length();i++) {
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
				pal += s.charAt(i);
			}
		}
		pal = pal.toLowerCase();
		for(int i1 = 0;i1 < pal.length() / 2;i1++) {
			if(pal.charAt(i1) != pal.charAt(pal.length() - 1 - i1)) {
				System.out.println(false);
			}
		}
		System.out.println(true);
	}
}


