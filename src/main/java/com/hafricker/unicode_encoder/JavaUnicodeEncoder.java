package com.hafricker.unicode_encoder;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.CharUtils;

public class JavaUnicodeEncoder {

    //Decode input String unicode to readable text
    public static String decode(final String input) {
        String Title = StringEscapeUtils.unescapeJava(input);
        return Title;
    }

    //Encode input String text to unicode
    public static String encode(String input) {

        //Get all character from input
        char[] cArray = input.toCharArray();
        String string = "";
        //Convert all character to it unicode and concat into the variable string
        for (int i = 0; i < cArray.length; i++) {
            string = string + CharUtils.unicodeEscaped(cArray[i]);
        }
        return string;
    }
}