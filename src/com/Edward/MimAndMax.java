package com.Edward;

public class MimAndMax {
    public static void main(String[] args) {
        int [] arry = { 23,57,45,99,10};

        int min = arry[0];
        int max = arry[0];
        double total = 0;

        for (int i=0; i<arry.length; i++) {

            total +=arry[i];


            if (arry[i] < min) {
                min = arry[i];
            }
            if (arry[i]> max){
                max=arry[i];
            }

        }
        System.out.println("Minimum = " + min + " maximun =" + max+ " Total = " + total);
    }
}
