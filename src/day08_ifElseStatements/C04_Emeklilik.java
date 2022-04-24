package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik<cinsiyet> {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas<60){
                System.out.println("Emekli olamazsiniz \n" +(60 - yas) +" yıl daha calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }


        }else if (cinsiyet == 'E'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas<65){
                System.out.println("Emekli olamazsiniz \n" +(65 - yas) +" yıl daha calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        }else{

            System.out.println("Lutfen Cinsiyet icin gecerli bir harf giriniz");
        }




    }
}
