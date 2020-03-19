package com.company;

// Let's take a look at the cycles:

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }

        System.out.println(" ");
        //for(long yy = 0, int xx = 4; xx < 5 && yy<10; xx++, yy++) { // DOES NOT COMPILE (Can't declare different types in one line with ,)
        //    System.out.print(x + " ");
        //}

        // For each cycle:
        /*
        for( datatype  instance : collection)

         */

        // For the OCA exam, the only members of the Collections framework that
        //  you need to be aware of are List and ArrayList.

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Alex";
        names[2] = "Kevin";

        for(String str : names){
            System.out.print(str + ", ");
        }


        // For each cycle compiling into the standart for cycle like this:
        /*

        for(int value : values) {
        System.out.print(value + ", ");
        }

        for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }
         */

        System.out.println("");

        // Try with List and without  ,  :
        //List<String> namesList = new List<String>();
        java.util.List<String> namesList = new java.util.ArrayList<String>();
        namesList.add("Alex");
        namesList.add("Ben");
        namesList.add("Kate");

        for(int i=0; i< namesList.size(); i++) {
            String name = namesList.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }

    }
}
