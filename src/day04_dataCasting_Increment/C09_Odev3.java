package day04_dataCasting_Increment;

public class C09_Odev3 {

    //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin

    public static void main(String[] args) {

        float num1 = 5.2687654f;
        System.out.println(num1);

        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin

        double num2 = 255.36;
        int num3 = (int) num2;
        System.out.println(num3);//255

        byte num4 = (byte) num3;
        System.out.println(num4);//-1

        //Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int num5 = 25;
        int num6 = 3;
        int num7 = num5 / num6;
        System.out.println(num7);//8

        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int num8 = 433;
        double num9 = 5.2;
        System.out.println(num8/num9);//83.269...

        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

        float sayi1 = 23.54f;
        double sayi2 = 5.21;
        System.out.println(sayi1/sayi2);

        float sayi3 = 20.00f;
        int sayi4 = 10;
        System.out.println(sayi3/sayi4);








    }
}
