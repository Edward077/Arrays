package com.Edward;

public class TestArray {
    public static void main(String[] args) {
        //=============================================
        // creating the first array
//
//        double [] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // Application using the for loop
//        for( int i =0; i<myList.length; i++){
//            System.out.println("The i value is:" + myList[i]);
//        }
//        // Summing Number
//        double sum = 0;
//        for(int i = 0; i<myList.length; i++){
//            sum += myList[i];
//
//        }
//        System.out.println("Total is" +sum);
//        // fined the largest number
//        double max = myList[0];
//        for(int i = 1; i < myList.length; i++){
//            if(myList[i]>max) max = myList[i];
//        }
//        System.out.println("Max is " + max);

        //===================================================

        // displace all elements in the list using foreach

//        double [] myList = {1.9, 2.9, 3.4, 3.5};
//        // print all the array elements
//        for (double element : myList){
//            System.out.println(element);
//        }

      //============================================

        // invoking the print array method
//        printArray(new int[]{3,1,2,6,4,2});
//        // Passing Arrays to Method
//    }
//    public static void printArray(int[] array){
//        for(int i =0; i<array.length; i++){
//            System.out.println(array[i]);
//        }
//    }
    //====================================================
//    // Returning an Array from a Method
//    public static int[] reverse(int[] list){
//        int[] result = new int[list.length];
//        for (int i = 0, j = result.length -1; i< list.length; i++, j--){
//            result[j]=list[i];
//        }
//        return result;


        int[] marks = {23,34,35,26};
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 35;
        marks[3] = 26;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
//        for( int i = 0; i<marks.length; i++){
//            System.out.println(marks[1]);
//        }

    }
//    public static int [] reverse (int[] output){
//        int[] mark = new int[output.length];
//    }
    public static void main (int [] input){

    }

}
