package day05_matematikselİslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");//7532
        int sayi = scan.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0;

        //1. adim r=0 rt=0 sayi=7532

        rakam = sayi%10; //2
        rakamlarToplami += rakam;//2
        sayi /= 10;//753

        //2.adım r=2 rt=2 sayi=753

        rakam = sayi % 10;//3
        rakamlarToplami += rakam;//5
        sayi /= 10;//75

        //3. adim r=3 rt=5 sayi=75

        rakam = sayi%10;//5
        rakamlarToplami += rakam;//10
        sayi /= 10;//7

        //4. adim r=5 rt=10 sayi=7

        rakam = sayi%10;//7
        rakamlarToplami += rakam;//17
        sayi /= 10;//0

        System.out.println("Rakamlar toplami : " + rakamlarToplami);



    }
}
