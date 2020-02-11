package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        out.println(Integer.MAX_VALUE);  // Maximum INT value

        // When a number is present in the code, it is called a literal.

        //long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L;  // Now Java knows it is a long

        out.println(56);    // 56   Normal base 10 value
        out.println(0b11);  // 3    Binary 11 -> 2+1=3
        out.println(017);   // 15   Octal (Base 8) numbers 1*8+7 = 15
        out.println(0x1F);  // 31   Hexal (Base 16) numbers 1*16+15 = 31

        int million1 = 1000000;     // Million
        int million2 = 1_000_000;   //  You can use underscore for a million

        double annouingNumbers = 1_00_0.0_0;    // Double value formatting


        /*
        double notAtStart = _1000.00;   // DOES NOT COMPILE
        double notAtEnd = 1000.00_;     // DOES NOT COMPILE
        double notByDecimal = 1000_.00; // DOES NOT COMPILE
         */


        // Now let's take a look at the Referrences:
        // A reference can be assigned to another object of the same type.
        // A reference can be assigned to a new object using the new keyword.

        // for example:
        java.util.Date today = new java.util.Date();        //
        String greeting = "How are you?";                   //

       out.println(greeting);
       out.print(today);

       // KEY differences between Refeneces and Primitives:
       // int value = null; // DOES NOT COMPILE
        String s = null;


    }
}
