package day07_ifElseStatements;

import java.util.Scanner;

public class C07_OdevSorulari1 {
    public static void main(String[] args) {

        // 1 Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin birinci kenarini giriniz");
        int birinciKenar = scan.nextInt();
        System.out.println("Lutfen dikdortgenin ikinci kenarini giriniz");
        int ikinciKenar = scan.nextInt();

        if (birinciKenar == ikinciKenar){
            System.out.println("Girilen degerler kareyi gosterir");
        }

        if (birinciKenar != ikinciKenar){
            System.out.println("Girilen degerler dikdortgeni gosterir");
        }
    }
}
