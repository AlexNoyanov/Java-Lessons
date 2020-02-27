package com.company;

// Lesson about String class in Java Lesson

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Here is the string object :
        String myString = "Hello, World!";
       // System.out.print(myString);


        int x = 1000;
        int x1 = 1_000;
        // int x2 = 1_000_; Not correct
        double y = 1000;
        double y1 = 1_000;


        // Two available String arrays in Java:
        String[] strArray;
        String strArraySecond[];        // - This is correct too

        int numberOfString;
        //numberOfString = System.in.read();
        Scanner myInput = new Scanner(System.in);

        numberOfString = myInput.nextInt();

        strArray = new String[numberOfString];

        for(int i = 0; i < numberOfString;i++){
            strArray[i] = myInput.nextLine();
        }

        // Printing from the String array:
        System.out.println(" ==== String array: ====");
        for(int i = 0; i < numberOfString; i ++){
            System.out.print(" String [");
            System.out.print(i);
            System.out.print("] = ");
            System.out.println(strArray[i]);
        }

    }
}
