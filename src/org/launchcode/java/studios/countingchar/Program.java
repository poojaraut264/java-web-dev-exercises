package org.launchcode.java.studios.countingchar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner input;
        String inputString = " ";
        String quoteString = " ";

        /*quoteString = "If the product of two terms is zero then common sense says at least one of the two terms has " +
        "to be zero to start with. So if you move all the terms over to one side, you can put the " +
        "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
        "Once you’ve done that, it’s pretty straightforward from there.";*/

        /*input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        quoteString = input.nextLine();*/
        try {
            inputString = ReadFile.inputFromFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        quoteString = RemoveNonAlphaChar.onlyAphabetString(inputString);

        for (char quoteChar: quoteString.toCharArray()) {
            char upperChar = Character.toUpperCase(quoteChar);

            if (charCount.containsKey(upperChar)) {
                int countValue = charCount.get(upperChar);
                countValue += 1;
                charCount.replace(upperChar,countValue);
            } else {
                charCount.put(upperChar,1);
            }
        }

//        System.out.println(charCount);

        for (Map.Entry<Character, Integer> validChar : charCount.entrySet()) {
            System.out.println(validChar.getKey() + ": " + validChar.getValue());
        }
    }

}
