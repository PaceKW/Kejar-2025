package Kejar_2;

import java.util.Scanner;

public class Cek_Jabatan {

    static void main() {

        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String idJabatan = input.nextLine();

        String hariKerjaStr = idJabatan.substring(0, 1);
        String jamKerjaStr = idJabatan.substring(1, 2);
        String tahunMasukStr = idJabatan.substring(2, 6);
        String jabatanKodeStr = idJabatan.substring(6, 7);


        String jabatan;

        switch (jabatanKodeStr){
            case "1":
                jabatan = "CEO";
                break;
            case "2":
                jabatan = "Manager";
                break;
            case "3":
                jabatan = "Staff";
                break;
            default:
                jabatan = "Unknown";
        }

        System.out.println("Nama          : " + nama);
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Tahun Masuk   : " + tahunMasukStr);
        System.out.println("Lama Kerja Per Hari : " + jamKerjaStr + " jam");

    }
}
