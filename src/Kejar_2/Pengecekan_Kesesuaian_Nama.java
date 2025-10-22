package Kejar_2;

import java.util.Scanner;

public class Pengecekan_Kesesuaian_Nama {

    static void main() {

        Scanner input = new Scanner(System.in);

        String nama1 = input.nextLine();
        String nama2 = input.nextLine();

        if (nama1.equals(nama2)){
            System.out.println("Nama tepat");
        } else if (nama1.equalsIgnoreCase(nama2)) {
            System.out.println("Nama sesuai (tidak peka huruf kapital)");
        } else {
            System.out.println("Nama tidak sesuai");
        }

        input.close();
    }
}
