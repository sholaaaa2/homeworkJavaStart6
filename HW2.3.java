package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		getCombination(arr,0);
	}

	public static void getCombination(int[] arr, int n) {
		if (n >= arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}

		getCombination(arr, n + 1);
		for (int i = n + 1; i < arr.length; i++) {
			int t = arr[i];
			arr[i] = arr[n];
			arr[n] = t;

			getCombination(arr, n + 1);

			t = arr[n];
			arr[n] = arr[i];
			arr[i] = t;

		}
	}
}
