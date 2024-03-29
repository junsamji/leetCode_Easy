package leetCode_852;

import java.util.Arrays;
import java.util.Collections;

public class leetCode_852 {

	public static void main(String[] args) {
		int finalValue = 0;
		// Testcase
		int[] value = {0,2,1,0};
		
		printArr(value, "원본값 [", "]");
		
		finalValue = peakIndexInMountainArray(value);
		
		System.out.println("정답:"+ finalValue);
		
	}
	
	private static int peakIndexInMountainArray(int[] A) {
		int result = 0;
		Integer[] B = new Integer[A.length];
		
		for (int i=0; i<A.length; i++) {
			B[i] = A[i];
		}
		
		Arrays.sort(B, Collections.reverseOrder());
		
		printArr(B, "변환값 [", "] ");
		
		for (int j=0; j<A.length; j++) {
			if (A[j] == B[0]) {
				result = j;
				break;
			}
		}
		
		return result;
	}
	
	private static void printArr(int[] arr, String left, String right) {
		String result = "";
		
		for (int i=0; i<arr.length; i++) {
			if (i == arr.length - 1) {
				result += arr[i];
			} else {
				result += arr[i] + ",";
			}
		}
		System.out.println(left + result + right);
	}
	
	private static void printArr(Integer[] arr, String left, String right) {
		String result = "";
		
		for (int i=0; i<arr.length; i++) {
			if (i == arr.length - 1) {
				result += arr[i];
			} else {
				result += arr[i] + ",";
			}
		}
		System.out.println(left + result + right);
	}

}
