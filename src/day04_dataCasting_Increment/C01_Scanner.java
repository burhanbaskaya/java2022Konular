package day04_dataCasting_Increment;


import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutffen isminizi giriniz");
        char ilkHarf = scan.next().charAt(6);

        System.out.println("Girdigininz ismin ilk harfi : " + ilkHarf);


    }

}
