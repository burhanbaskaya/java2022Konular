package day05_matematikselİslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

        int sayi = 10;
        //sayiyi 1artırmak istersek
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        System.out.println(++sayi);
        System.out.println(sayi);

        System.out.println(sayi++);//13
        System.out.println(sayi);//14


    }
}
