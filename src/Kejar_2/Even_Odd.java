package Kejar_2;

import java.util.Scanner;

public class Even_Odd {

    static void main() {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        // TERNARY
        System.out.print((a%2==0) ? "Even" : "Odd");

        // IF ELSE
//        if (a%2==1){
//            System.out.print("Odd");
//        }else {
//            System.out.print("Even");
//        }
        input.close();

    }
}
