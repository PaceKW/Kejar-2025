package Kejar_2;

import java.util.Scanner;

public class Pemilihan_Pengurus {

    static void main() {

        Scanner input = new Scanner(System.in);

        int angkatan = input.nextInt();
        int kehadiran = input.nextInt();

        if (angkatan == 2020 || angkatan == 2021){
            if (kehadiran >= 70){
                System.out.println("Lolos menjadi pengurus");
            } else {
                System.out.println("Tidak lolos menjadi pengurus");
            }
        } else if (angkatan == 2022) {
            if (kehadiran >= 80){
                System.out.println("Lolos menjadi pengurus");
            } else {
                System.out.println("Tidak lolos menjadi pengurus");
            }
        } else if (angkatan == 2023 || angkatan == 2024) {
            if (kehadiran >= 90){
                System.out.println("Lolos menjadi pengurus");
            } else {
                System.out.println("Tidak lolos menjadi pengurus");
            }
        } else {
            System.out.println("Tidak lolos menjadi pengurus");
        }

        input.close();
    }
}
