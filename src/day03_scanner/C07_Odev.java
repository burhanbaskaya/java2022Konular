package day03_scanner;

import java.util.Scanner;

public class C07_Odev {

    public static void main(String[] args) {

        //Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();//15
        int sayi2 = scan.nextInt();//5

        System.out.println("Toplam : " + (sayi1 +sayi2));//20
        System.out.println("Fark : " + (sayi1 - sayi2));//10
        System.out.println("Carpim : " + (sayi1 * sayi2));//75


        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
        //hesaplayip yazdirin

        System.out.println("Lutfen karenin bir kenarini giriniz");//21
        int kenarUzunlugu = scan.nextInt();

        System.out.println("Karenin Cevresi : " + (kenarUzunlugu * 4));//84
        System.out.println("Karenin Alani : " + (kenarUzunlugu * kenarUzunlugu));//441

        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        System.out.println("Lutfen cemberin yaricapini giriniz");
        int yaricap = scan.nextInt();

        System.out.println("Cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("Cemberin alani : " + 3.14*yaricap*yaricap);

        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        System.out.println("Lutfen uzun kenari giriniz");
        int uzun = scan.nextInt();//5

        System.out.println("Lutfen kisa kenari giriniz");
        int kisa = scan.nextInt();//4

        System.out.println("Lutfen yuksekligi giriniz");
        int yukseklik = scan.nextInt();//2

        System.out.println("Prizmanin hacmi : " + uzun*kisa*yukseklik);//40

        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        System.out.println("Lutfen adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyAd = scan.nextLine();

        System.out.println("Isminiz : " + ad);
        System.out.println("Soyisminiz : " + soyAd);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");



        //Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
        //sekilde yazdirin
        //Isim – soyisim : Mehmet Bulutluoz

        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String isimSoyisim = scan.nextLine();

        System.out.println("İsim - soyisim : " + isimSoyisim);

        //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.






    }
}
