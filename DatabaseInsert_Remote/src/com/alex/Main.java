package com.alex;

import java.time.LocalDateTime;

//import org.telegram.telegrambots.meta.api.objects.Update;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;

public class Main {

    //public void sendMessageToDatabase(LocalDateTime date, String userMessage, long chatID) {

    /*

    Test databases: u689866_tests
    91.236.136.57	u689866_alex
    M9m0G4y3

     */

    public static void main(String[] args) {
	// write your code here
        try {

            // Sending to messages:
            String request = "INSERT INTO test(text,value) values('text',123456789);" ;
            //request = request.concat("');");

            System.out.println("MySQL REQUEST:");
            System.out.println(request);

            //mySQLRequest(request);

            //List<String> lines = Files.readAllLines(Paths.get(infoPath));
            //String sqlPassword = lines.get(2);            // MySQL password (Third one in the text file botinfo.txt)
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    // ?useUnicode=true&serverTimezone=UTC
                    "jdbc:mysql://91.236.136.57/u689866_tests", "u689866_alex", "M9m0G4y3");
            Statement stmt = con.createStatement();
            int rs = stmt.executeUpdate(request);
            con.close();

        }catch (Exception e){
            System.out.print("==== MySQL REQUEST ERROR! ====");
            System.out.println(e);
        }

//            int rs = stmt.executeUpdate(request);
//
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
