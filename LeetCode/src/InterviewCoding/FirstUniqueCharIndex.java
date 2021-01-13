package InterviewCoding;

public class FirstUniqueCharIndex {

	public static void main(String[] args) {

		String s = "tcodtcode";
		System.out.println(firstUniqChar(s));

	}

	private static int firstUniqChar(String s) {
		
		char[] c = new char[26];
		for(int i = 0;i < s.length();i++) {
			if(c[s.charAt(i) - 'a'] != 1) {
				int j = i + 1;
				for(j = i + 1;j < s.length();j++) {
					if(s.charAt(i) == s.charAt(j)) {
						c[s.charAt(i) - 'a'] = 1;
						break;
					}
				}
				if(j == s.length()) {
					return i;
				}
			}
		}
		return -1;
	}

}
