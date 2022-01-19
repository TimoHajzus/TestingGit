package com.company;

import java.util.Scanner;

public class HodKockou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj počet kociek");
        int pocetKociek = sc.nextInt();
        System.out.println("Zadaj počet hodov");
        int pocetHodov = sc.nextInt();
        int[] hody = new int[pocetHodov];
        int[] vysledok = new int[6];
        for (int i = 0; i < hody.length; i++) {
            hody[i]=0;
        }
        for (int i = 0; i < vysledok.length; i++) {
            vysledok[i] = 0;
        }
        for (int i = 0; i < hody.length; i++) {
            for (int j = 0; j < pocetKociek; j++) {
                int nahoda = (int) (Math.random() * 6) + 1;
                hody[i] += nahoda ;
                vysledok[nahoda-1]++;
            }
            //vysledok[(hody[i]-1)]++;
            System.out.print(hody[i] + " ");
        }
        System.out.println();

        System.out.println("Početnosť výsledkov hodov");
        for (int i = 0; i < vysledok.length; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < vysledok[i]; j++) {
                System.out.print(".");
            }
            System.out.println("*" + vysledok[i]);
        }
    }
}
