package com.hafricker.buyCar;

public class BuyCar {

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
}
