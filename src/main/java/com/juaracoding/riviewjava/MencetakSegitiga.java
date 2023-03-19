package com.juaracoding.riviewjava;

import java.util.Scanner;

public class MencetakSegitiga {
    public static void main(String[] args) {
        int angka1, angka2;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan angka ke-1 : ");
        angka1 = scn.nextInt();

        System.out.print("Masukan angka ke-2 : ");
        angka2 = scn.nextInt();

        for (int i = 0; i <= angka1; i++) {
            for (int j = i + 1; j <= angka2 - i; j++) {
                if (j%2 == 0){
                    System.out.print("_");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();

        }
    }

}