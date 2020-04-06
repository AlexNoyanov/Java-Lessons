package com.alex;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 18330
        // 4077

        String link = "https://scontent-frx5-1.cdninstagram.com/v/t51.2885-15/e35/91127262_840241943112072_2111894168306547242_n.jpg?_nc_ht=scontent-frx5-1.cdninstagram.com&_nc_cat=100&_nc_ohc=xogMW5IUVbkAX815zSb&oh=6119e278c187bd08727bbe6374f82e51&oe=5E89DBCC";
        String link2 = "https://www.youtube.com/watch?v=IkEADs9ftvc";

        int convertedLink = 0;

        String simpleStr = "Test";
       // String code = "";
        int code = 0;
       // System.out.println(code);

        for(char c : link2.toCharArray()){
            System.out.print("Symbol  ");
            System.out.print(c);
            System.out.print(" = ");
            System.out.println((int)c);

            code += (int) c;

        }

        System.out.println(code);

    }
}
