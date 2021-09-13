package com.hafricker.mumbling;

public class Accumul {

    /**
     * My Solution
     */
    public static String accum(String s) {
        String[] list = s.split("");
        int size=list.length;
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(list[0].toUpperCase());
        for(int i=1;i<size;i++){
            if(list[i]!=null){
                stringBuilder.append("-").append(list[i].toUpperCase());
                for(int j=0;j<i;j++){
                    stringBuilder.append(list[i].toLowerCase());
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Best Solution on CodeWar
     */
    public static String accumRefacto(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
}
