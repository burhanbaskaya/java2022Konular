package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayiTekrar {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Gİrdiginiz sayi cifttir");
        }

        if (sayi%2!=0){
            System.out.println("Girdiginiz sayi tektir");
        }

        if (sayi%2 == 0){
            System.out.println("Girilen sayi cifttir");
        } else {
            System.out.println("Girilen sayi tektir");
        }
    }
}
