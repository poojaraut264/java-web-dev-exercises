package org.launchcode.java.studios.countingchar;

public class RemoveNonAlphaChar {
    public static String onlyAphabetString(String inputString) {
        String[] stringArray = inputString.split("\\W+");
        String result = new String();
        for(int i = 0; i < stringArray.length;i++){
            result = result+ stringArray[i];
        }
        return result;
    }
}
