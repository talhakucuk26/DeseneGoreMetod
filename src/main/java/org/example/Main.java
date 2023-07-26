package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scn.nextInt();

        System.out.print(sayi + " ");
        sayi = cikar(sayi);
        System.out.print(sayi + " ");
    }

    public static int cikar(int sayi) {
        if (sayi <= 0) {
            return sayi + 5;
        } else {
            System.out.print((sayi - 5) + " ");
            return cikar(sayi - 5);
        }
    }
}