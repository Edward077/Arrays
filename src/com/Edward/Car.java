package com.Edward;

public class Car {
    public static void main(String[] args) {
//        int [] car = {1,2,3,4,5,6};

//        for( int i = 0; i<car.length; i++){
//            System.out.println(car[i]);
////
        int[][] myNumber = {{12, 23, 34, 25, 23, 44}, {1, 2, 3, 4, 5}};
        for (int i = 0; i < myNumber.length; i++) {

            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.println("The values are = " + myNumber[i][j]);
            }

//        int x =myNumber[1][3];
//        System.out.println("Display the values of x = " + x);

        }
    }
}
