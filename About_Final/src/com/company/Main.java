package com.company;

// The lesson about 'final' in Java
// By Alex Noyanov
// March 18 2020


public class Main {


    private int getSortOrder(String firstName, final String lastName){
        String middleName = "Patricia";
        final String suffix = "JR";       // At the context of Variables the word 'final' means that this variable is constant
        int id = 0;
        // The data type
        //for case statements must all match the data type of the switch variable
        switch(firstName) {                 // The data type of this switch is
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break;
        }
        return id;

    }


    public static void main(String[] args) {
	// write your code here





    }
}
