package com.hafricker.findOutlier;

public class FindOutlier{
    static int find(int[] integers){
        int isEven = 0;
        int isEvenAp = 0;
        int IsOddAp = 0;
        int isOdd = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                isEvenAp = i;
                isEven++;
            } else {
                isOdd++;
                IsOddAp = i;
            }
        }
        if (isEven != 1) {
            return integers[IsOddAp];
        }
        return integers[isEvenAp];
    }}