package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		makeSqr(4,5);
	}

	public static void makeSqr(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
