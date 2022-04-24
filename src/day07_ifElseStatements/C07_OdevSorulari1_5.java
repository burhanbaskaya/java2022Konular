package day07_ifElseStatements;

import java.util.Scanner;

public class C07_OdevSorulari1_5 {
    public static void main(String[] args) {

        // Kullanicidan bir gun aliniz gun cuma ise ekrana "Muslsmanlar icin kutsal gun" yazdirin. "Cumartesi" ise ekrana
        //"Yahudiler icin kutsal gun" Pazar ise "Hristiyanlar icin kutsal gun" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gunIsmi.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gunIsmi.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
    }
}
