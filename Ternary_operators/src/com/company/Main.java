
// The lesson about Ternary Operators:
// Created by Alexander Noyanov on Sat, March 14 2020

// The structure of the ternary operators in Java:
// booleanExpression ? expression 1 : expression2;

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Quick look at the ternary operators here:
        // IF exprerssion:
        int y = 10;
        final int x;
        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        // The same thing but with ternary operators:
        int yy = 10;
        int xx = (yy > 5) ? (2 * y) : (3 * y);

        int yyy = 6;

        System.out.println((yyy > 5) ? 21 : "Zebra");

        // int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE (Can't use String data type for int)

        // Another example for if and ternary expression:
        if( x == 5){
            System.out.println("x = 5");
        }else{
            System.out.println(x);
        }

        System.out.println((x==5) ? "x = 5" : x);   // This is equal to IF code writen before



    }
}
