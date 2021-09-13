package com.hafricker.unicode_encoder;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.CharUtils;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

public class JavaUnicodeEncoder {

    /**
     * My Solution
     */

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

    /**
     * Best Solution on CodeWar
     */

    static String encodeRefacto(String input) {
        return input.chars().mapToObj(c -> String.format("\\u%04x", c)).collect(joining());
    }

    static String decodeRefacto(String input) {
        return of(input.split("\\\\u")).filter(u -> !u.isEmpty()).map(u -> (char) Integer.parseInt(u, 16) + "").collect(joining());
    }
}