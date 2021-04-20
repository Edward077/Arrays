package com.Edward;

public class Main {

    public static void main(String[] args) {
	// write your code here


       // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
      //  int [] array = new int[45];
//        myIntArray[0] =45;
//        myIntArray[1]= 476;
//        myIntArray[2]= 50;
//        System.out.println( myIntArray[1]);
//        System.out.println( myIntArray[6]);
//        System.out.println( myIntArray[3]);
//        System.out.println( myIntArray[8]);
//        for(int i=0; i<10; i++) {
//            myIntArray[i] = i * 10;
//        for( int i=50; i<array.length; i++){
//            System.out.println(" the value is " + i + "the #" + array[i]);
       // }
//        for( int i=0; i<10; i++){
//            System.out.println("Element " + i + " Value is " +myIntArray[i]);
//        }

//
//        double [] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // Application using the for loop
//        for( int i =0; i<myList.length; i++){
//            System.out.println("The i value is:" + i);
//        }
//        // Summing Number
//        double total = 0;
//        for(int i = 0; i<myList.length; i++){
//            total += myList[i];
//
//        }
//        System.out.println("Total is =" +total);
//        // fined the largest number
//        double max = myList[0];
//        for(int i = 1; i < myList.length; i++){
//            if(myList[i]<max) max = myList[i];
//        }
//        System.out.println("Max is " + max)


    }
    public static void printArray (int [] array){
        int [] myIntArray = new int[25];
        for(int i =1; i <myIntArray.length; i++){
            myIntArray[i] = i*10;
            System.out.println("My array Value is=" +myIntArray[i]);
        }
    }
}
