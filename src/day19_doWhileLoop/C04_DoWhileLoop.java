package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //  ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //  yanlislikla kac negative sayi girdigini
        //  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int input = 1;
        int negatifSayi = 0;
        int pozitifSayi = 0;
        int inputToplam = 0;



        do {
            System.out.println("Lufen pozitif tamsayi giriniz \nIslemi bitirmek icin 0'a basiniz");

            input = scan.nextInt();

            if (input>0){
                pozitifSayi++;
                inputToplam += input;

            }else if (input<0){
                System.out.println("Negatif sayi giremezsiniz");
                negatifSayi++;

            }


        }while (input!=0);
        System.out.println("Girilen pozitif tamsayi : " + pozitifSayi + " toplami : " + inputToplam);
        System.out.println("Yanlislikla girilen negatif tamsayi : " + negatifSayi);







    }
}
