package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi = 20;
        sayi = sayi + 10;
        sayi +=10;

        System.out.println(sayi + 10);//50

        // bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir

        System.out.println("30.satir : "+ sayi++); // 40
        System.out.println("31.satir : " + sayi); // 41

        System.out.println("34.satir : " + ++sayi); // 42
        System.out.println("35.satir : " + sayi); // 42

        int num1 = 10;
        num1 ++;
        System.out.println(num1);//11

        System.out.println("25. satirdaki deger : " + num1++);//11
        System.out.println("26. satirdaki deger : " + num1);//12
        System.out.println("27. satirdaki deger : " + ++num1);//13
    }
}
