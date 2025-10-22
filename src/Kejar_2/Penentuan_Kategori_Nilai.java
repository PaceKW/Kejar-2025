package Kejar_2;

import java.util.Scanner;

public class Penentuan_Kategori_Nilai {

    static void main() {

        Scanner input = new Scanner(System.in);

        int angkatan = input.nextInt();
        int nilai = input.nextInt();

        if (angkatan == 2020 && nilai > 85){
            System.out.println("Nilai sangat memuaskan");
        } else if (angkatan == 2020) {
            System.out.println("Nilai cukup baik");
        }else if (angkatan == 2021 && nilai > 80) {
            System.out.println("Nilai memuaskan");
        } else if (angkatan == 2021){
            System.out.println("Nilai perlu ditingkatkan");
        } else if (angkatan == 2022 && nilai > 75) {
            System.out.println("Nilai baik");
        } else if (angkatan == 2022){
            System.out.println("Nilai kurang");
        } else if (angkatan == 2023 && nilai > 70) {
            System.out.println("Nilai lumayan");
        } else if (angkatan == 2023){
            System.out.println("Nilai kurang");
        } else if (angkatan == 2024 && nilai > 65) {
            System.out.println("Nilai awal yang baik");
        } else {
            System.out.println("Nilai kurang, perlu usaha lebih");
        }
    }
}
