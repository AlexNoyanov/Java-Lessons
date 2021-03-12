package com.alex;

// Task: Find missing number 1..100

// Friday 11th of September 2020

// you can also use BitSet in Java to solve this problem.
//
//Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz6XhzmEcwW


//        1) Sum of the series: Formula: n (n+1)/2( but only work for one missing number)
//        2) Use BitSet, if an array has more than one missing elements.
//

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // One missing number:
        printMissingNumber(new int[]{1,5,3,4,6},6);
//
//        // two missing number
//        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
//
//        // three missing number
//        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
//
//        // four missing number
//        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);

        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
      //  int missing = getMissingNumber(iArray, 5);
//        System.out.printf("Missing number in array %s is %d %n",
//                Arrays.toString(iArray), missing);

    }

// Метод для поиска одного пропущенного значения:
 private static void printMissingNumber(int[] numbers, int totalCounter){
    //  Formula: f(n) = n (n+1)/2
     // x = sum(n) - f(n)

     int expected = totalCounter  * (totalCounter + 1) / 2;

     int actual = 0;

     for(int i: numbers) {
        actual += i;
     }
     System.out.print("Missed number is: ");
     System.out.println( expected - actual);



 }

}
