package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emekllik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya buyukse emekli olabilirsin
        //65 ten kucukse emekli olamazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin");
            System.out.println(65-yas + " sene calismalisin");
        } else {
            System.out.println("emekli olabilirsin");

        }
        // if else statement'larda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calismama ihtimali =====> YOK

    }
}
