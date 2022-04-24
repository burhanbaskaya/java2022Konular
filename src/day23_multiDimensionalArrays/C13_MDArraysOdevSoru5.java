package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C13_MDArraysOdevSoru5 {

    public static void main(String[] args) {

        // Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        String arr[] = cumle.split(" ");

        System.out.println("Kelime sayisi : " + arr.length); //4
    }
}
