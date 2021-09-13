package com.hafricker.mumbling;

public class Accumul {

    public static String accum(String s) {
        String[] list = s.split("");
        int size=list.length;
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(list[0].toUpperCase());
        for(int i=1;i<size;i++){
            if(list[i]!=null){
                stringBuilder.append("-"+list[i].toUpperCase());
                for(int j=0;j<i;j++){
                    stringBuilder.append(list[i].toLowerCase());
                }
            }
        }
        return stringBuilder.toString();
    }
}
