package com.alex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/*

JSON parser test for InstaAnalytics App
Using GSON

By Alexander Noyanov

GSON Documentation:  http://www.studytrails.com/java/json/java-google-json-introduction/
GSON code: http://www.java2s.com/Code/Jar/g/gson.htm


 */


public class Main {

    public static void main(String[] args) {

        Gson g = new Gson();
        Person person = g.fromJson(jsonString, Person.class);


    }
}
