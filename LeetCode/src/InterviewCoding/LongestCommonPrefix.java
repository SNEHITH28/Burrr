package InterviewCoding;

public class LongestCommonPrefix {

	public static void main(String[] args) {


		String strs[] = {"flower","flow","flight"};
		String out = "";
		if(strs[0].length() < strs[1].length()) {
			out = strs[0];
		}
		else {
			out = strs[0].substring(0, strs[1].length());
		}
		while(true) {
			int i;
			for(i = 0;i < strs.length;i++) {
				if(out.length() > strs[i].length()) {
					out = strs[i];
				}
				else if(!(out.equals(strs[i].substring(0, out.length())))) {
					out = out.substring(0, out.length() - 1);
					break;
				}
			}
			if(i == strs.length) {
				break;
			}
		}
		if(!out.equals(strs[1].substring(0, out.length())) || !out.equals(strs[0].substring(0, out.length()))) {
			System.out.println("");
		}


		int i = 0;
		do {
			i++;
			if(i == 2) {
				continue;
			}
		}while(i < 2);
		System.out.println(i);
	}

}
