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


    }
}
