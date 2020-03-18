package com.company;

// March 17 2020
// The Lesson about Switch statement
//

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

/*
    Switch expression can be used with this:
    ■ int and Integer
    ■ byte and Byte
    ■ short and Short
    ■ char and Character
    ■ int and Integer
    ■ String
    ■ enum values
 */

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int value = 0;

        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();

        Scanner strIn = new Scanner(System.in);

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


        String strValue = "";
        while(!strValue.equals("password")){
            out.println("Input the password string:");
            strValue = strIn.nextLine();

            switch (strValue){
                case "Password":
                    out.println("Almoust right");
                    break;

                case "pasword":
                    out.println("Try this but different");
                    break;

                case "password":
                    out.println("  ==== Correct! ====");
                    break;

                default:out.println("Not correct");
                        break;

            }

        }


        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }


    }
}
