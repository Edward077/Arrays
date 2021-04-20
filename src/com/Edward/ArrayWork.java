package com.Edward;

public class ArrayWork {
    public static void main(String[] args) {
//        double[] myList;
        // creating an array of 10 number
        double[] myList = new  double[10];
        // Assigning values to the array myList
        myList[0]= 1.0;
        myList[1]= 3.0;
        myList[3]= 1.0;
        myList[4]= 6.0;
        myList[5]= 8.0;
        myList[7]= 9.0;
        myList[7]= 10.0;
        myList[8]= 11.0;
        myList[9]= 13.0;
        // Out put the ArrayList
//        System.out.println("The out are" + myList[4]);

        // printing all the element in the array list

//        for (int i= 0; i<myList.length; i++) {
//            System.out.println("The values are " + myList[i] + "");

            // to find the total in the list
//            double Total =0;
//            for (int i =0; i<myList.length; i++ ){
//                Total +=myList[i];
//                System.out.println("The total is =" +Total);
                // find the max value of the array list
                double max = myList[0];
                double min = myList[0];
                for (int i=1; i<myList.length; i++){
                  // apply the conditional statement
                  if(myList[i]> max) max = myList[i];
                  if(myList[i]< min) min = myList[i];
                }

                System.out.println("The Max value is " + max + " Min = " + min);

    }

    }

