package day07_ifElseStatements;

import java.util.Scanner;

public class OrnekSoru3 {
    public static void main(String[] args) {

        //Girilen sayı 0 ile 100 arasında ve çift ise “Sayı Uygun”, aksi halde “Sayı Uygun Değil” mesajı veren program

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>0 && sayi<100 && sayi%2 == 0){
            System.out.println("Sayı Uygun");
        } else{
            System.out.println("Sayı Uygun Değil");
        }
    }
}
