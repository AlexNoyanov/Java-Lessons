package com.company;

// Lesson about Compound Assignment Operators in Java
// March 4 2020
// By Alex Noyanov

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x = 2, z = 3;
        System.out.println(x);
        x = x * z; // Simple assignment operator
        System.out.println(x);
        x *= z; // Compound assignment operator
        System.out.println(x);

    // The left-hand side of the compound operator can only be applied to a variable that is
    // already defi ned and cannot be used to declare a new variable
         //long x1 +=10; // Not working
         //int x2*=z;
        long x3 = 10;
        int y3 = 5;
        // Error:(25, 17) java: incompatible types: possible lossy conversion from long to int:
       //y3 = y3 * x3; // DOES NOT COMPILE
        // Because of this: int*long converting to long
        // But assignment operator = wouldn't work with it: int = long
        // To make it workable use
        y3 = (int) (y3 * x3);
        // or this:
        y3 = y3 * (int)x3;

    }
}
