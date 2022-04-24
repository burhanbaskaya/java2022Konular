package day07_ifElseStatements;

import java.util.Scanner;

public class C07_OdevSorulari2 {
    public static void main(String[] args) {

        //2- kullanicidan bir karakter girmesiini isteyin ve girilenkarakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().toUpperCase().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("girilen karakter harftir");
        }else{
            System.out.println("girilen karakter harf degildir");
        }


    }
}
