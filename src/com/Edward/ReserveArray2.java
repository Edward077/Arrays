package com.Edward;

import java.util.Arrays;

public class ReserveArray2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,7,11,9,15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse array = " + Arrays.toString(array));

    }
    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLenght = array.length/2;
        for(int i =0; i< halfLenght; i++) {
            int tem = array[i];
            array[i] = array[maxIndex - 1];
            array[maxIndex - 1] = tem;


        }
    }
}
