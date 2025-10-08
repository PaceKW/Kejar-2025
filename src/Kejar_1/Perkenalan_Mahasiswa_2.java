package Kejar_1;

import java.util.*;

public class Perkenalan_Mahasiswa_2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama = sc.nextLine();
        String NIM = sc.nextLine();
        String Program_Studi = sc.nextLine();
        String Fakultas = sc.nextLine();
        String No_HP = sc.nextLine();
        String Asal_Kota = sc.nextLine();

        sc.close();

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Program Studi : " + Program_Studi);
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("No. HP : " + No_HP);
        System.out.println("Asal Kota : " + Asal_Kota);
    }
}
