package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {

        int sayi1 = 4;
        int sayi2 = 2;

        System.out.println(sayi1/sayi2);//2

        sayi2 = 3;

        System.out.println(sayi1/sayi2);//1

        sayi1 = 22;

        System.out.println(sayi1/sayi2);//7

        sayi1 = 4895;
        double sayi3 = 10;

        int sayi = (int)(sayi1/sayi3);       // iki farkli sayi data turunu isleme koydugumuzda
        int say = (int)(sayi3/sayi1);        // Java kucuk olan data turu icin autoWidening yapar
                                             // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder

        System.out.println(sayi);//489
        System.out.println(say);//0

    }
}
