package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		String str = "HEllo World, I am Java Developer";
		
		System.out.println(getCountOfWords(str));
	}

	public static int getCountOfWords(String str) {
		return str.split(" ").length;
	}

}
