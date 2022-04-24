package day19_doWhileLoop;

public class C06_OdevSoru1 {
    public static void main(String[] args) {

        // 9 dan 190 a kadar olan tum sayilari ekrana yazdiriniz

        int sayi = 9;

        do {
            System.out.print(sayi + " ");
            sayi++;

        }while (9<=sayi && sayi<=190);

    }
}
