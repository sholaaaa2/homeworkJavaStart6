package com.gmail.kukaruka52;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array1[] = {0,2,4,6,8,10,12};
        int array2[] = {1,4,7,10,13};
        int array3[] = {1,2,4,8,16,32};
        int array4[] = {1,3,9,27};
        int array5[] = {1,4,9,16,25};
        int array6[] = {1,8,27,64,125};
        int array7[] = {1,2,5,10,20};

        nextElement(array1);
        nextElement(array2);
        nextElement(array3);
        nextElement(array4);
        nextElement(array5);
        nextElement(array6);
        nextElement(array7);
	}

	public static void nextElement(int[] array) {
        double[] koef = new double[array.length - 1];
        boolean b = true;
        System.out.print("Next element of sequence " + Arrays.toString(array));
        if (nextElementArifmetic(array, koef, b) != -1){
            System.out.println(" is " + nextElementArifmetic(array, koef, b));
        }else if (nextElementMultiple(array, koef, b) != -1){
            System.out.println(" is " + nextElementMultiple(array, koef, b));
        }else if (nextElementExp2(array, koef, b) != -1){
            System.out.println(" is " + nextElementExp2(array, koef, b));
        }else if (nextElementExp3(array, koef, b) != -1){
            System.out.println(" is " + nextElementExp3(array, koef, b));
        }else{
            System.out.println(" can't be found");
        }
    }

    
    public static int nextElementExp3(int[] array, double[] koef, boolean b) {
        for (int i = 0; i < array.length - 1; i++) {
            koef[i] = (Math.pow(array[i + 1], 1.0/3) - Math.pow(array[i], 1.0/3));
        }
        for (int i = 0; i < koef.length - 1; i++) {
            if (koef[i] - koef[i + 1] >= 0.0000000001) {
                b = false;
            }
        }
        if (b) {
            return (int)((Math.pow((int)(Math.pow((array[array.length-1]), 0.333) + 2), 3)));
        }else {
            b = true;
        }
        return -1;
    }

    
    public static int nextElementExp2(int[] array, double[] koef, boolean b) {

        for (int i = 0; i < array.length - 1; i++) {
            koef[i] =  Math.sqrt(array[i + 1]) - Math.sqrt(array[i]) ;
        }
        for (int i = 0; i < koef.length - 1; i++) {
            if (koef[i] != koef[i + 1]) {
                b = false;
            }
        }
        if (b) {
            return (int)((Math.sqrt(array[array.length-1]) + 1) * (Math.sqrt(array[array.length-1]) + 1));
        }else {
            b = true;
        }
        return -1;
    }

   
    public static int nextElementMultiple(int[] array, double[] koef, boolean b) {

        for (int i = 0; i < array.length - 1; i++) {
            koef[i] = (double) array[i + 1] / (double) array[i];
        }
        for (int i = 0; i < koef.length - 1; i++) {
            if (koef[i] != koef[i + 1]) {
                b = false;
            }
        }
        if (b) {
            return array[array.length-1] * array[array.length-1] / array[array.length - 2];
        }else {
            b = true;
        }
        return -1;
    }

    
    public static int nextElementArifmetic(int[] array, double[] koef, boolean b) {

        for (int i = 0; i < array.length - 1; i++) {
            koef[i] = array[i + 1] - array[i];
        }
        for (int i = 0; i < koef.length - 1; i++) {
            if (koef[i] != koef[i + 1]) {
                b = false;
            }
        }
        if (b) {
            return array[array.length-1] + array[array.length-1] - array[array.length - 2];
        }else {
            b = true;
        }
        return -1;
    }
}
