package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		int[] maxArr = {1,5,4,9,11};
		System.out.println(getMax(maxArr));
		
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = (max < arr[i]) ? arr[i] : max;
		}
		return max;
	}

}
