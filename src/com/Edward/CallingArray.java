package com.Edward;

public class CallingArray {
    public static void main(String[] args) {
        int[] marks = { 22,66,33,99,88,77};
      display(marks); // called the display method and pass the marks as an argument

        int[] remarks;
        remarks = reverseArray(marks);
        System.out.println("Reverse array element");
        display(remarks);

    }
    public static void display ( int[] input){
        for (int counter = 0; counter < input.length; counter++){
            System.out.println(input[counter]);
        }

    }
    public static int [] reverseArray (int[] input){
        int[]reverse = new int[input.length];
        // create a for loop
        for( int i = 0, j = reverse.length-1; i < input.length; i++, j--){
            reverse[j] = input[i];
        }
        return reverse;
    }
}
