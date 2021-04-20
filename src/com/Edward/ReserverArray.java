package com.Edward;

public class ReserverArray {
    public static void main(String[] args) {
        int[] scores = { 1,2,3,4,5,6};
        main(scores);
        System.out.println("======================");

        int [] rescore;
        rescore=reserveArray(scores);
        main(rescore);
    }

    public static void main(int[] input) {
        for (int i = 0; i< input.length; i++){
            System.out.println("the lenght value =" + input[i]);

        }

    }
    public static int[] reserveArray(int[] input){
        int[] reserve = new int[input.length];
        for (int i = 0, k=reserve.length - 1; i<input.length; i++, k--){
            reserve[k] = input[i];

        }
        return reserve;
    }
}
