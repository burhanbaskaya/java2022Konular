package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_OdevSoru03 {

    // kullanicidan bir sayi girmesini iste
    //girilen sayi
    //10 ise "iki basmakli en kucuk sayi
    //100 ise "uc basmakli en kucuk sayi
    //1000 ise "dort basmakli en kucuk sayi
    //diger durumlarda "Girdigin sayiyi degistir" yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10 100 1000 sayilarindan bir tanesini giriniz");
        int sayi = scan.nextInt();

        switch (sayi) {

            case 10:
                System.out.println("iki basmakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basmakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basmakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }
    }
}
