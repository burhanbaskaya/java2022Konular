package day19_doWhileLoop;

import java.util.Scanner;

public class C06_OdevSoru6 {
    public static void main(String[] args) {

        // Kullanicidan toplamak icin sayi isteyin
        // ve toplam 500 oluncaya kadar devam etmesini isteyin
        // Toplam 500e ulastiginda  veya gectiginde toplami ve kac sayi girildigini yazin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int sayac = 0;
        int sayiToplami = 0;

        do {
            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            sayiToplami += sayi;
            sayac++;

        }while(!(sayiToplami>500));

        System.out.println("Girilen " +sayac+ " sayinin toplami : " +sayiToplami);
    }
}
