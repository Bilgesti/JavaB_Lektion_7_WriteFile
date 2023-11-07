package com.bilgee.demo;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        String osName = System.getProperty( "os.name" ).toLowerCase();
        String osNameOneWord = osName.substring(0, osName.indexOf( ' ' ));
        String compUsername = System.getProperty( "user.name" );

        System.out.println(osName);
        System.out.println(osNameOneWord);
        System.out.println(compUsername);

        switch (osNameOneWord){
            case "linux" -> System.out.println("LINUX OS");
            case "mac"  -> System.out.println("MAX OS");
            case "windows" -> System.out.println("WINDOWS OS");

            default -> System.out.println("Unknown OS, contact developer for more features");
        }


        // Create Writer
        try (
            Writer writer = new BufferedWriter(
                            new OutputStreamWriter(
                            new FileOutputStream( "myFile.txt" ), StandardCharsets.UTF_8 )
            )){

            System.out.println("Inside Text Writer");

            // Logic
            int age = 5;
            String name = "Benny";

            writer.write( name + " " + age );

            // TODO - Error Handling
            // TODO - Test

        }catch ( IOException e) {
            throw new RuntimeException(e);
        }

    }
}
