package day16_methodCreation;



public class C03_OverLoading {
    public static void main(String[] args) {

        // Verilen iki sayiyi toplayip yazdiran bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        // İki double sayinin toplamini yazdiran method olusturalim

        ikiSayiTopla(sayi1,sayi2);

        double sayi3 = 10.5;
        double sayi4 = 11.2;

        ikiSayiTopla(sayi3,sayi4);

        int sayi5 = 15;
        double sayi6 = 10.5;

        ikiSayiTopla(sayi5,sayi6);

        double sayi7 = 10.6;
        int sayi8 = 4;

        ikiSayiTopla(sayi7,sayi8);




    }
    private static void ikiSayiTopla(int sayi3, double sayi4) {
        System.out.println("Bir integer bir double tolami : "+(sayi3+sayi4));
    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("İki sayinin double tolami : "+(sayi3+sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("İki sayinin integer tolami : "+(sayi1+sayi2));
    }
}
