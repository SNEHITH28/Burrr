package InterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		
		/*int [] digits = {9,8,9};
		int [] res = plusOne(digits);
		for(int i : res) {
			System.out.print(i + " ");
		}*/
		ArrayList<Integer> A  = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(-1);
		System.out.println(maxArr(A));
		/*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
                if(h.containsKey(arr[i])) {
                	h.replace(arr[i], h.get(arr[i]) + 1);
                }
                else {
                	h.put(arr[i], 1);
                }
            }
            ArrayList<Integer> a = new ArrayList<Integer>(h.keySet());
            System.out.println(a);
            System.out.println(h);
            for(int i = 0;i < a.size();i++) {
            	if(h.get(a.get(i)) > 1) {
            		System.out.print(a.get(i) + " ");
            	}
            }
            
        }*/
		/*Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n ;i++){
                arr[i]= s.nextInt();
            }
            Arrays.sort(arr);
            int max = 0;
            int count = 1;
            for(int i = 0;i < n - 1;i++){
            	
                if(Math.abs(arr[i + 1] - arr[i]) == 1){
                    count++;
                    //System.out.println(arr[i + 1] + "-" + arr[i] + " = " + Math.abs(arr[i+1] - arr[i]));
                    //System.out.println(count);
                }
                else{
                    if(max < count){
                        max = count;
                    }
                    count = 1;
                }
            }
            System.out.println(max);
        }*/

	}
	
	public static int numSetBits(int a){
        if(a == 0){
            return 0;
        }
        if((a & (a - 1)) == 0){
            return 1;
        }
        return 1 + numSetBits(a & (a - 1));
    }
    public static int solve(int A) {

        
		int count = 0;
		while(A % 2 != 1){
		    A = A / 2;
		    count++;
		}
		return count;
    }
	
	

	public static int maxArr(ArrayList<Integer> A) {
        int n = A.size();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0;i< n;i++) {
        	max1 = Math.max(max1, A.get(i) + i);
        	max2 = Math.max(max2, -A.get(i) + i);
        	min1 = Math.min(min1, A.get(i) + i);
        	min2 = Math.min(min2, -A.get(i) + i);
        }
        return Math.max(max1 - min1, max2 - min2);
    }
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int len = A.size();
        boolean c9 = true;
        for(int i = 0;i < len;i++){
            if(A.get(i) != 9){
                c9 = false;
                break;
            }
        }
        int[] carry;
        int sum = 0;
        if(c9){
            carry = new int[len + 1]; 
            carry[len] = 1;
            for(int i = len - 1;i >= 0;i--){
            	sum = carry[i + 1] + A.get(i);
                carry[i + 1] = (sum) % 10;
                carry[i] = (sum) / 10;
            }
        }
        else{
            carry = new int[len];
            carry[len - 1] = 1;
            for(int i = len - 1;i > 0;i--){
            	sum =(carry[i] + A.get(i));
                carry[i] = sum  % 10;
                carry[i - 1] = sum / 10;
            }
            carry[0] = carry[0]+A.get(0);
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        boolean f = true;
        for(int i = 0;i < carry.length;i++){
            if(!(carry[i] == 0 && f)){
                res.add(carry[i]);
                f = false;
            }
            
        }
        return res;
    }

	private static int[] plusOne(int[] digits) {
		int len = digits.length;
        boolean c9 = true;
        for(int i = 0;i < len;i++){
            if(digits[i] != 9){
                c9 = false;
                break;
            }
        }
        int[] carry;
        int sum = 0;
        if(c9){
            carry = new int[len + 1]; 
            carry[len] = 1;
            for(int i = len - 1;i >= 0;i--){
            	sum = carry[i + 1] + digits[i];
                carry[i + 1] = (sum) % 10;
                carry[i] = (sum) / 10;
            }
        }
        else{
            carry = new int[len];
            carry[len - 1] = 1;
            for(int i = len - 1;i > 0;i--){
            	sum =(carry[i] + digits[i]);
                carry[i] = sum  % 10;
                carry[i - 1] = sum / 10;
            }
            carry[0] = carry[0]+digits[0];
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0;i < carry.length;i++){
            res.add(carry[i]);
        }
        System.out.println(res);
        return carry;
	}
	
	

}
