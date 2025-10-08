package Kejar_1;

import java.util.Scanner;

public class Penjumlahan_Dua_Bilangan_Bulat {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;

        System.out.println("Hasil Penjumlahan: " + c);
        sc.close();
    }
}
