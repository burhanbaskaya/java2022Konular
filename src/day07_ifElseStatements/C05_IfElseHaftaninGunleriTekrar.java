package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleriTekrar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gunIsmi giriniz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("CUMARTESİ") || gunIsmi.equals("PAZAR")){
            System.out.println("Girilen gun hafta sonudur");
        } else {
            System.out.println("Girilen gun hafta icidir");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
        gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
        gunIsmi.equals("cuma")) {
            System.out.println("Girdıgınız gun hafta icidir");
        } else {
            System.out.println("Girdiginiz gun hafta sonudur");
        }
    }
}
