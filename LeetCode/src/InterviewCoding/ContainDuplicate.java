package InterviewCoding;

import java.util.HashMap;

public class ContainDuplicate {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		System.out.println(containDup(nums));
	}

	private static boolean containDup(int[] nums) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0;i < nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				return true;
			}
			else {
				hm.put(nums[i], 1);
			}
		}
		return false;
	}

}
