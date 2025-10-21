package Kejar_2;

import java.util.Scanner;

public class Rekomendasi_Kegiatan {

    static void main() {

        Scanner input = new Scanner(System.in);
        int suhu = input.nextInt();

        if (suhu>30) {
            System.out.println("Bersiap untuk kegiatan indoor di GOR UB");
        } else if(suhu>=20){
            System.out.println("Siapkan kegiatan hiking di Bukit Kuneer!");
        } else if (suhu>=10) {
            System.out.println("Jangan lupa jaket! Kegiatan renungan di Coban Rais");
        } else if (suhu>0) {
            System.out.println("Cuaca terlalu dingin! Ganti ke acara doa online");
        } else if (suhu == 0) {
            System.out.println("Mungkin mesin cuaca rusak? Cek lagi dan konsultasikan dengan panitia.");
        }

        input.close();
    }
}
