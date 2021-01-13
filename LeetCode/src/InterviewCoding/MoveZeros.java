package InterviewCoding;

public class MoveZeros {

	public static void main(String[] args) {
		
		int [] nums = {0,1,0,2,12};
		int [] res = moveZeroes(nums);
		for(int i : res) {
			System.out.print(i + " ");
		}

	}

	private static int[] moveZeroes(int[] nums) {
		
		int ptr = 0;
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] != 0) {
				int temp = nums[ptr];
				nums[ptr++] = nums[i];
				nums[i] = temp;
			}
		}
		return nums;
	}

}
