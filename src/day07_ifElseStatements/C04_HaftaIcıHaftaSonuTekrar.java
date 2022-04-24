package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIcıHaftaSonuTekrar {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        // String case sensitive(harfe duyarli)'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")){

            System.out.println("Girdiginiz gun hafta sonudur");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){

            System.out.println("Girilen gun hafta icidir");
        }

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")){
            System.out.println("Girilen gun haftasonudur");
        } else {
            System.out.println("Girilen gun hafta icidir");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){
            System.out.println("Girilen gunhaftaicidir");
        } else {
            System.out.println("Girilen gun haftasonudur");
        }



    }

}
