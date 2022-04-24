package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2 ==0){
            System.out.println("girrilen sayi cift sayidir");
        }

        if (sayi%2!=0){
            System.out.println("girilensayi tek sayidir");
        }

        // normalde bir sayi ya tektir ya cifttir, ucuncu durum yoktur
        // o zaman
        //========= if else ile cozum =========

        if (sayi%2 ==0){
            System.out.println("girrilen sayi cift sayidir");
        } else {
            System.out.println("girilensayi tek sayidir");
        }
    }
}
