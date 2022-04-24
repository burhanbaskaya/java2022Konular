package day05_matematikselİslemler;

public class C06_wrapperClass {

    public static void main(String[] args) {


        String str1 = "12345";
        String str2 = "23456";

        //Verilen iki string deki sayilari toplayin

        System.out.println(str1 + str2);//1234523456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));//35801

        double s1 = 18.934;
        int s2 = (int) s1;
        System.out.println(s2);


    }
}
