package com.gmail.kukaruka52;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(searchPolindrom());
	}

	static int searchPolindrom() {
		int a = 999;
		int b = 999;
		int poli = 0;
		for (int i = a; i >= 100; i--) {

			for (int j = b; j >= 100; j--) {
				int c = i * j;
				if (isPolindrom(c) && (c > poli)) {
					poli = c;
					break;
				} else {
					continue;
				}

			}
		}

		return poli;
	}

	static boolean isPolindrom(int c) {
		String text = Integer.toString(c);
		String rev = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			String col = String.valueOf(text.charAt(i));
			rev += col;
		}
		if (text.equals(rev)) {
			return true;
		} else {
			return false;
		}

	}
}
