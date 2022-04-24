package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        
        
        // Kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini yazdirin

        int sayiAdedi = 3;

        Scanner scan = new Scanner(System.in);
        int sayi =0;
        int toplam = 0;


        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println(sayiAdedi + " sayinin toplami : " + toplam);

        // While ile yapalim

        sayi = 0;
        toplam = 0;
        int sayac = 1;


        while (sayac <= sayiAdedi){
            System.out.println("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++; //For loop la While loop arasindaki en büyük fark sayaci artirmak artirmazsak sonsuz dongu olusur

        }
        System.out.println(sayiAdedi + " sayinin toplami : " + toplam);
        


        
        
        
    }
}
