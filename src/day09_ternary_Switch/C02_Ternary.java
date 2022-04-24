package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {


        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran kod

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
    }
}
