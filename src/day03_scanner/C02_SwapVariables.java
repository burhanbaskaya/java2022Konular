package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        // 1- verilen sayi1 ve sayi2 variable'larin degerlerini degistiren (SWAP) bir program yaziniz.
        // orn: sayi1= 10 sayi2=20;
        // kodcalistiktan sonra
        // sayi1=20 sayi2=10;

        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swap'dan once sayi1 : " + sayi1 + ", sayi2 : " + sayi2);

        int temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        System.out.println("Swap'dan sonra sayi1 : " + sayi1 + ", sayi2 : " + sayi2);
    }
}
