package com.hafricker.buyCar;

public class BuyCar {

    /**
     * My Solution
     */
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double oldPrice = startPriceOld;
        double newPrice = startPriceNew;

        double carMoney = oldPrice;

        while (carMoney < newPrice) {
            month++;
            if (month % 2 == 0) {
                percentLossByMonth = percentLossByMonth + 0.5;
            }
            oldPrice = (oldPrice - (percentLossByMonth * oldPrice / 100));
            newPrice = (newPrice - (percentLossByMonth * newPrice / 100));
            carMoney = oldPrice + month * savingperMonth;
        }
        int saved = (int) Math.round (carMoney - newPrice);
        return new int[]{month, saved};
    }

    /**
     * Best Solution on CodeWar
     */
    public static int[] nbMonthsRefacto(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 1;
        int savings = 0;
        double startPriceOldD = (double) startPriceOld;
        double startPriceNewD = (double) startPriceNew;
        while (startPriceNewD > (startPriceOldD + savings)) {
            if (month % 2 == 0) percentLossByMonth += .5d;
            startPriceOldD *= (1 - percentLossByMonth / 100);
            startPriceNewD *= (1 - percentLossByMonth / 100);
            savings += savingperMonth;
            month++;
        }
        return new int[] { --month, (int) Math.round((startPriceOldD + savings) - startPriceNewD) };
    }
}
