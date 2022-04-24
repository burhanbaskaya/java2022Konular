package day03_scanner;

import java.util.Scanner;

public class C08_Odev2 {

    public static void main(String[] args) {

        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String ad = scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String soyAd = scan.nextLine();

        System.out.println("Adiniz : " + ad);
        System.out.println("Soyadiniz : " +soyAd);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");


    }
}
