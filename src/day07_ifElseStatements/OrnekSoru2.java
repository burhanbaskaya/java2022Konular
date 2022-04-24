package day07_ifElseStatements;

import java.util.Scanner;

public class OrnekSoru2 {
    public static void main(String[] args) {

        //Girilen sayı hem 2 hem de 3 ile tam bölünebiliyorsa “OK”, aksi halde “HATA” mesajı veren program

        //Girilen sayı hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katı”, sadece 2 ile bölünebiliyorsa
        // “2’nin katı”, sadece 3 ile bölünebiliyorsa “3’ün katı”, ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katı değil”
        // mesajı veren program

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2 == 0 && sayi%3 == 0){
            System.out.println("2 ve 3’ün katı");
        }
        else if (sayi%2 == 0){
            System.out.println("2’nin katı");
        }
        else if (sayi%3 == 0){
            System.out.println("3’ün katı");
        }
        else if (sayi%2 != 0 && sayi%3 != 0){
            System.out.println("2 veya 3’ün katı değil");

        } else {
            System.out.println("Gecerli bir sayi giriniz");
        }
    }
}
