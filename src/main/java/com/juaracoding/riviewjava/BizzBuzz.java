package com.juaracoding.riviewjava;

public class BizzBuzz {
    public static void main(String[] args) {
        int angka;

        angka = 100;

        for (int i = 1; i <= angka; i++) {

            if (i % 15 == 0) {
                System.out.println("BizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Bizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
