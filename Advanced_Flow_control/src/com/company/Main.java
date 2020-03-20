package com.company;

// We’ll now show you other ways loops could end, or branch,
//and you’ll see that the path taken during runtime may not be as straightforward as in simple examples

public class Main {

    public static void main(String[] args) {

        // Writing the matrix:
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        System.out.println(" ");

        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }

        System.out.println(" ");
        System.out.println(" ");

        // Labels to make it visible with 'label':
        int[][] myComplexArray2 = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int[] mySimpleArray2 : myComplexArray2) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray2.length; i++) {
                System.out.print(mySimpleArray2[i] + "\t");
            }
            System.out.println();
        }


        // Let's search for element position using break and loop label:
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {         // This loop is called "Parent loop"
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;                 // To break the parent loop, not the inner one
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }
    }
}
