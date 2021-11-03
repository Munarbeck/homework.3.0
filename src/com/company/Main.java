package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] points = {1.2, 3.5, 4.4, 5.6,
                -3.2, -6.5, 6.6, 7.8, -4.5, 10.9, -24.2, 45.7,
                -32.4, -12.4, 9.6};

        double point = 0;
        double con = 0;
        boolean isBot = false;

        for (double myHand : points) {
            if (myHand < 0) {
                isBot = true;
            } else {
                if (isBot) {
                    point++;
                    con += myHand;
                }
            }
        }
        System.out.println(con / point);

        samsungHyindai(points);
        System.out.println(Arrays.toString(points));
    }

    public static void samsungHyindai(double[] mcmunar) {
        for (int i = 0; i < mcmunar.length; i++) {
            double defaultDigit = mcmunar[i];
            for (int j = i; j < mcmunar.length; j++) {
                if (defaultDigit > mcmunar[j]){
                    double d = defaultDigit;
                    defaultDigit = mcmunar[j];
                    mcmunar[j]=d;
                }

            }
            mcmunar[i] = defaultDigit;
        }
    }


    }
