package com.company;

public class Main {

    public static void main(String[] args) {
	// Operators in Java:
        /*
    There are three types of operators
    -Unary
    -Binary
    -Ternary
        */

        int y = 4;
        double x = 3 + 2 * --y;     // 3 + 2*3 = 3+6 = 9
        // Unary opearot first: y--
        // Other binary operators second
        //System.out.println(y);

        int a = 10;
        double a1 = 10;
        int b = 4;
        int c = a/b;        // int = int/int
        double d = a/b;     // int = double/int
        double d1 = a1/b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(d1);

        System.out.println(" ");

        int e = 2 * 5 + 3 * 4 - 8;  // 10 + 12 - 8 = 22 - 8 = 14
        System.out.println(e);

        System.out.println(" ");
        int f  = 10 + 12 - 8;       // 22 - 8 = 14
        System.out.println(f);

        System.out.println(x);

        System.out.println(" ");

        System.out.println(9 / 3);  // Outputs 3
        System.out.println(9 % 3);  // Outputs 0
        System.out.println(10 / 3); // Outputs 3
        System.out.println(10 % 3); // Outputs 1
        System.out.println(11 / 3); // Outputs 3
        System.out.println(11 % 3); // Outputs 2
        System.out.println(12 / 3); // Outputs 4
        System.out.println(12 % 3); // Outputs 0


    }
}
