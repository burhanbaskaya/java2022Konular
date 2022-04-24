package day04_dataCasting_Increment;

public class C06_Odev1 {

    //Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
    //birer degisken olusturup adim adim widening yapin ve yazdirin

    public static void main(String[] args) {

        byte num1 = 125;
        System.out.println(num1);//125

        short num2 = num1;
        System.out.println(num2);//125

        int num3 = num2;
        System.out.println(num3);//125

        long num4 = num3;//125
        System.out.println(num4);

        float num5 = num4;
        System.out.println(num5);//125.0

        double num6 = num5;
        System.out.println(num6);//125,0



    }
}
