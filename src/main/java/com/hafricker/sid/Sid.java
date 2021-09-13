package com.hafricker.sid;

public class Sid {

    /**
     * My Solution
     */
    public static String howMuchILoveYou(int nb_petals) {
        if((nb_petals==1)||(nb_petals%6==1))
            return "I love you";
        else if((nb_petals==2)||(nb_petals%6==2))
            return "a little";
        else if((nb_petals==3)||(nb_petals%6==3))
            return "a lot";
        else if((nb_petals==4)||(nb_petals%6==4))
            return "passionately";
        else if((nb_petals==5)||(nb_petals%6==5))
            return "madly";
        return "not at all";
    }

    /**
     * Best Solution on CodeWar
     */
    public static String howMuchILoveYouRefacto(int nb_petals) {
        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        return arr[nb_petals%6];
    }
}