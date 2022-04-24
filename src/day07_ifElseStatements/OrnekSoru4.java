package day07_ifElseStatements;

import java.util.Scanner;

public class OrnekSoru4 {
    public static void main(String[] args) {

        //Girilen 3 sayıdan en az biri 50’den büyükse “Yeterli”, aksi halde “Yetersiz” mesajı veren program
        //Girilen 3 sayının hepsi 0’dan büyük ve çift ise “Başarılı Giriş”, aksi halde “Başarısız giriş” mesajı veren program

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        if (sayi1>0 && sayi2>0 && sayi3>0 &&
            sayi1%2 == 0 && sayi2%2 == 0 && sayi3%2 == 0 ){
            System.out.println("Başarılı Giriş");
        } else {
            System.out.println("Başarısız giriş");
        }

    }
}
