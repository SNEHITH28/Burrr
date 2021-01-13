package InterviewCoding;

import java.util.*;


public class Intersecting2Arrays {

	public static void main(String[] args) {
		int nums1[] = {43,85,49,2,83,2,39,99,15,70,39,27,71,3,88,5,19,5,68,34,7,41,84,2,13,85,12,54,7,9,13,19,92};
		int nums2[] = {10,8,53,63,58,83,26,10,58,3,61,56,55,38,81,29,69,55,86,23,91,44,9,98,41,48,41,16,42,72,6,4,2,81,42,84,4,13};
		int res[] = intersect(nums1,nums2);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
		int len1 = nums1.length;
		int len2 = nums2.length;
		int []res;
		if(len1 < len2) {
			res = new int[len1];
		}
		else {
			res = new int[len2];
		}
		for(int i = 0;i < len1;i++) {
			if(hm1.containsKey(nums1[i])) {
				hm1.replace(nums1[i], hm1.get(nums1[i]) + 1);
			}
			else {
				hm1.put(nums1[i], 1);
			}
		}
		for(int i = 0;i < len2;i++) {
			if(hm2.containsKey(nums2[i])) {
				hm2.replace(nums2[i], hm2.get(nums2[i]) + 1);
			}
			else {
				hm2.put(nums2[i], 1);
			}
		}
		System.out.println(hm1);
		System.out.println(hm2);
		ArrayList<Integer> key;
		if(hm1.size() < hm2.size()) {
			key = new ArrayList<Integer>(hm1.keySet());
		}
		else {
			key = new ArrayList<Integer>(hm2.keySet());
		}
		int temp = 0;
		int count = 0;
		for(int i = 0;i < key.size();i++) {
			if(hm1.containsKey(key.get(i)) && hm2.containsKey(key.get(i))) {
				if(hm1.get(key.get(i)) == hm2.get(key.get(i))) {
					temp = hm1.get(key.get(i));
				}
				else {
					if(hm1.get(key.get(i)) < hm2.get(key.get(i)))
					     temp = hm1.get(key.get(i));
					else
						temp = hm2.get(key.get(i));
				}
				for(int j = 0;j < temp;j++) {
					res[count++] = key.get(i);
				}
			}
		}
		int out[] = new int[count];
		for(int i = 0;i < count;i++) {
			out[i] = res[i];
		}
		return out;
    }

}
