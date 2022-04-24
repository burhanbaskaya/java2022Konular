package day19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int bolen = 1;
        int sayac = 0;


        while (bolen<=sayi){

            if (sayi%bolen==0){
                System.out.print(bolen + " ");
                sayac++;

            }
            bolen++;

        }
        System.out.println("");
        System.out.println(sayi + " sayisini bolen " + sayac + " adet sayi vardir");

        //for ile cozum

        int sayi2 = 30;
        int sayac2 = 0;

        for (int i = 1; i < sayi2; i++) {

            if (sayi2%i==0){
                System.out.print(i +" ");
                sayac2++;
            }
            i++;

        }
        System.out.println("");
        System.out.println(sayi2 +" sayisini bolen " + sayac2 + " sayi vardir");





    }
}
