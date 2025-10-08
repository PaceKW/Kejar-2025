package Kejar_1;

import java.util.Scanner;

public class Perhitungan_Lingkaran {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();

        float keliling = 2*3.14f*r;
        float luas = 3.14f*r*r;

        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);

        sc.close();
    }
}
