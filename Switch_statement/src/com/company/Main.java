package com.company;

// March 17 2020
// The Lesson about Switch statement
//

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int value = 0;

        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();

        while (value != 1) {
            out.println("Input some value:");
            //in.readNBytes(value);
            value = in.nextInt();


            switch (value) {
                case 1:
                    out.print("You guess the right number! It is 1!");
                    break;

                case 5:
                    out.println("Still too much! try lower");
                    out.println("Something like 0 or 1");
                    break;
                case 10:
                    out.println(" Try lower.. 10 is too much  ");
                    break;
            }
        }

    }
}
