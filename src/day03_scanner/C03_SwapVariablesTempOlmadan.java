package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
        // 1- verilen sayi1 ve sayi2 variable'larin 3. variable olmadan degerlerini degistiren (SWAP) bir program yaziniz.
        // orn: sayi1= 10 sayi2=20;
        // kodcalistiktan sonra
        // sayi1=20 sayi2=10;

        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swap'tan once sayi1 : " + sayi1 + ", sayi2 : " + sayi2);

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("Swap'tan sonra sayi1 : " + sayi1 + ", sayi2 : " + sayi2);
    }
}
