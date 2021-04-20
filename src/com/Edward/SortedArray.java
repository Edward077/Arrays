package com.Edward;
import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {

    }

    public static int[] getIntegers(int number)
    {
        int [] intArray = new int[number];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < number; i++ )
        {
            intArray[i] = scanner.nextInt();
            //scanner.nextInt();
        }
        System.out.println(Arrays.toString(intArray));

        return intArray;
    }

    public static int [] sortIntegers(int [] intArray)
    {
        boolean isNotSorted = true;
        int [] sortedArray = Arrays.copyOf(intArray, intArray.length);
        while(isNotSorted)
        {
            isNotSorted = false;

            for(int i = 0; i < sortedArray.length -1; i++  )
            {
                if(sortedArray[i] < sortedArray[i + 1])
                {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isNotSorted = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int [] printArray)
    {
        for(int i = 0; i < printArray.length ; i ++)
        {
            System.out.println("Element " + i + " contents " + printArray[i]);
        }
    }
}
