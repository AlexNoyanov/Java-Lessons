package com.company;

public class Main {

    public static void main(String[] args) {

        int hourOfDay = 12;
        int morningGreetingCount = 0;
        //for(int i = 0; i < 10;i++) {

            if (hourOfDay < 11)
                System.out.println("Good Morning"); // This string of code will be executed after IF
            morningGreetingCount++;                 // But this one not in the IF without braces {}
        //}
    }
}
