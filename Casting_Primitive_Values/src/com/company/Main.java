package com.company;


// March 3 2020
// By Alexander Noyanov

// Casting primitive values

import java.io.File;

public class Main {



    public static void main(String... $n) {
	// write your code here
        int x = (int) 1.125;                        // float value will be converted to int
        System.out.println(x);

        short y = (short) 1921222;                  // this number converting to int
        System.out.println(y);

        long t = 192301398193810323L;               // This long is a very big number
        System.out.println(t);

        int z = (int)9l;
        System.out.println(z);

        System.out.print(2147483647+1); // -2147483648


        File xx = new File("myFile.txt");
        File yy = new File("myFile.txt");
        File zz = xx;
        System.out.println(xx == yy); // Outputs false
        System.out.println(xx == zz); // Outputs true



    }
}
