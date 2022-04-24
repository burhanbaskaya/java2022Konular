package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // ) Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;
        int sayac = 0;


        while (sayi != 0){
            rakam = sayi%10;
            rakamlarToplami += rakam;
            sayi /= 10;
            sayac++;
        }
        System.out.println(sayac + " basamakli sayinin rakamlari toplami : " + rakamlarToplami);




    }
}
