package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 33, 8, 0, 11, 2, 13, 4 };
		System.out.println(getIndex(arr, 4));
	}

	public static int getIndex(int[] arr, int a) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			index = (arr[i] == a) ? i : index;
		}
		return index;
	}

}
