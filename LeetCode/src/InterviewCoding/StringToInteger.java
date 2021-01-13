package InterviewCoding;

public class StringToInteger {

	public static void main(String[] args) {
		
		String str = "-91283472332";
		str= str.trim();
		String s1 = "";
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				break;
			}
			else {
				s1 += str.charAt(i);
			}
		}
		if(s1 == "")
			System.out.println(0);
		

	}

}
