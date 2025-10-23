package Kejar_2;

import java.util.Scanner;

public class Pembayaran_Barang_Pecahan_Uang_Lengkap {

    static void main() {

        Scanner input = new Scanner(System.in);

        int harga = input.nextInt();

        int jumlah10000;
        int jumlah5000;
        int jumlah1000;
        int jumlah500;
        int jumlah200;
        int jumlah100;

        // 1. Pecahan 10000 Rupiah
        jumlah10000 = harga / 10000;
        harga = harga % 10000;

        // 2. Pecahan 5000 Rupiah
        jumlah5000 = harga / 5000;
        harga = harga % 5000;

        // 3. Pecahan 1000 Rupiah
        jumlah1000 = harga / 1000;
        harga = harga % 1000;

        // 4. Pecahan 500 Rupiah
        jumlah500 = harga / 500;
        harga = harga % 500;

        // 5. Pecahan 200 Rupiah
        jumlah200 = harga / 200;
        harga = harga % 200;

        // 6. Pecahan 100 Rupiah
        // Karena H adalah kelipatan 100, harga di sini seharusnya 0 setelah pembagian.
        jumlah100 = harga / 100;
        harga = harga % 100;

        System.out.print(jumlah10000 + " ");
        System.out.print(jumlah5000 + " ");
        System.out.print(jumlah1000 + " ");
        System.out.print(jumlah500 + " ");
        System.out.print(jumlah200 + " ");
        System.out.print(jumlah100);

        input.close();
    }
}
