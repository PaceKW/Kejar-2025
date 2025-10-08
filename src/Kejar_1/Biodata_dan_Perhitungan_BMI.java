package Kejar_1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Biodata_dan_Perhitungan_BMI {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Nama = sc.nextLine();
        int Umur = sc.nextInt();
        float Tinggi_Badan = sc.nextFloat();
        float Berat_Badan = sc.nextFloat();
        float BMI = Berat_Badan / (Tinggi_Badan/100 * Tinggi_Badan/100);

        System.out.printf("%-15s: %s\n", "Nama", Nama);
        System.out.printf("%-15s: %d tahun\n", "Umur",Umur);
        System.out.printf("%-15s: %.0f cm\n", "Tinggi Badan", Tinggi_Badan);
        System.out.printf("%-15s: %.0f kg\n", "Berat Badan", Berat_Badan);
        System.out.printf("%-15s: %.2f\n", "BMI", BMI);

        sc.close();
    }
}
