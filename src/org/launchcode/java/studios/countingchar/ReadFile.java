package org.launchcode.java.studios.countingchar;
// Java Program to illustrate reading from text file
// as string in Java
import java.nio.file.*;

public class ReadFile {

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static String inputFromFile() throws Exception {
        String data = readFileAsString("C:\\Users\\pooja\\lc101\\java\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingchar\\InputString.txt");
        System.out.println(data);
        return data;
    }
}