package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIfTekrar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")){
            System.out.println("Girilen gun hafta sonudur");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
        gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("Girilen gun hafta icidir");

        }else{
            System.out.println("Lutfen gecerli bir gun giriniz");

        }
    }
}
