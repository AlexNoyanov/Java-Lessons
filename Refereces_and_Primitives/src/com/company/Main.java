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


        boolean b1, b2;             // This is OK
        String s1 = "1", s2;        // Fine too
       // double d1, double d2;       // ILLEGAL!
        int i1; int i2;               // OK
        //int i3; i4;                 // Of corse this is ILLEGAL

        double annouingNumbers = 1_00_0.0_0;    // Double value formatting


        /*
        double notAtStart = _1000.00;   // DOES NOT COMPILE
        double notAtEnd = 1000.00_;     // DOES NOT COMPILE
        double notByDecimal = 1000_.00; // DOES NOT COMPILE
         */

        /*
            There are only three rules to remember for legal identifi ers:
            ■ The name must begin with a letter or the symbol $ or _.
            ■ Subsequent characters may also be numbers.
            ■ You cannot use the same name as a Java reserved word. As you might imagine, a
            reserved word is a keyword that Java has reserved so that you are not allowed to use it.
            Remember that Java is case sensitive, so you can use versions of the keywords that only
            differ in case. Please don’t, though.
         */

        int  $h;        // OK
        int  aAaaA;     // FINE
        int _good;      // why not? still good
        // int 3a;      // NOO..
        // int *coffe; NOT a letter, $ or _

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
