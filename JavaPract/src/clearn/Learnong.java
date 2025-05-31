package clearn;

import java.util.Arrays;

public class Learnong {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void merge(int[] arr, int left, int right, int mid) {
		int l = left;
		int r = mid + 1;
		int[] num = new int[right - left + 1];
		int index = 0;
		while(l <= mid && r <= right) {
			if(arr[l] < arr[r]) {
				num[index] = arr[l];
				l++;
			} else {
				num[index] = arr[r];
				r++;
			}
			index++;
		}
		
		while(l <= mid) {
			num[index] = arr[l];
			l++;
			index++;
		}
		while(r <= right) {
//			System.out.println(Arrays.toString(num) + " " + left + " " + right + " " + mid);
			num[index] = arr[r];
			r++;
			index++;
		}
		index = left;
		for(int i = 0; i < num.length; i++) {
			arr[index] = num[i];
			index++;
		}
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int mid = (left + right) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		
		merge(arr, left, right, mid);
	}
	public static void main(String[] args) {
		int[] arr = new int[] {554,20,2,1,2,4,33,23};
//		bubbleSort(arr);
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
