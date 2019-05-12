package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[] a = {4, 1, 6, 1, 1, 4, 3, 3, 1};
        int n = a.length;
        int wynik = 0;
        int x = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                wynik = wynik + 1;
            }
        }
        System.out.println(x + "wystepuje: " + wynik + " razy");

    }
}