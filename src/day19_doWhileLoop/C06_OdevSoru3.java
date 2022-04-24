package day19_doWhileLoop;

import java.util.Scanner;

public class C06_OdevSoru3 {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin
        // Islemi bitirmesi icin 0'a basmasini soyleyin
        // Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini
        // ve girdigi pozitif sayilarinin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int toplamSayi = 0;
        int sayac = 0;

        do {
            System.out.println("Lutfen pozitif tamsayi giriniz \nIslemin bitirilmesi icin 0'a basiniz");
            sayi = scan.nextInt();
            sayac++;
            toplamSayi += sayi;

        }while (sayi!=0);

        System.out.println("Girilen toplam pozitif tamsayi : "+ (sayac) + " Toplami : " + toplamSayi);

    }
}
