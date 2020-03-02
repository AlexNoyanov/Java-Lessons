package com.company;

// Feb 28 2020
// Java Numeric Promotion rules:
/*
    1)If two values have different data types, Java will automatically promote one of the values
      to the larger of the two data types.

    2)If one of the values is integral and the other is floating-point, Java will automatically
      promote the integral value to the floating-point value’s data type.

    3)Smaller data types, namely byte, short, and char, are first promoted to int any time
     they’re used with a Java binary arithmetic operator, even if neither of the operands is
      int.

     4)After all promotion has occurred and the operands have the same data type, the resulting
        value will have the same data type as its promoted operands.

 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        // For example:
        int x = 1;
        long y = 33;                // The resulting value of x*y is long because long is bigger type
        System.out.println(x*y);

        // This code will not compile!
        // double x1 = 1.1;
        // float  y2 = 1.5;         float should be 1.5f
        // System.out.println(x1+y1);

        short x3 = 10;
        short y3 = 3;
        // The result of x3/y3 is INT not a short!

        short x4 = 14;      // in Ariphmetic operations short type always converting to the INT
        float y4 = 13;
        double z4 = 30;
        // The result of x4*y4/z4 is double


        // Unary operators:
        /*
        +
        -
        ++
        --
        !
         */

    // Logical complement operator:
    boolean  x5 = false;
    System.out.println(x5);
    x5 = !x5;
    System.out.println(x5);
    // Negation operator:
    double x6 = 1.125;
    x6 = -x6;

      //  int x = !5; // DOES NOT COMPILE
      //  boolean y = -true; // DOES NOT COMPILE
      //  boolean z = !0; // DOES NOT COMPILE

        int x7 = 3;
        int y7 = ++x7 * 5 / x7-- + --x7;
        System.out.println("x7 is " + x7);
        System.out.println("y7 is " + y7);


    }
}
