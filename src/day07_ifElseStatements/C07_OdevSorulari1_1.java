package day07_ifElseStatements;

import java.util.Scanner;

public class C07_OdevSorulari1_1 {
    public static void main(String[] args) {

        //2- Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimleini
        // yazdirin p s c p c c p

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P'){
            System.out.println("Pazar, Pazartesi ve Persembe");
        }
       else if (ilkHarf == 'S'){
            System.out.println("Sali");
        }
       else if (ilkHarf == 'C'){
            System.out.println("Carsamba, Cuma ve Cumartesi");
        }else{
            System.out.println("Yanlis bir ifade girdiniz");
        }

    }
}
