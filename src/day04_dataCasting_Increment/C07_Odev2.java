package day04_dataCasting_Increment;

public class C07_Odev2 {

    //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

    public static void main(String[] args) {

        int num1 = 34500;
        System.out.println(num1);//34500

        short num2 = (short) num1;
        System.out.println(num2);

        byte num3 = (byte) num2;
        System.out.println(num3);



    }
}
