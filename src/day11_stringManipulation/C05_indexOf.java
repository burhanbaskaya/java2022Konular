package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";
        //
        System.out.println(str1.indexOf('J'));//0
        //
        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf("aska"));//10

        //

        System.out.println(str1.indexOf("b"));//5


        System.out.println(str1.indexOf('b', 5));

        //









        // kullanicidan mail adresini isteyin @adresi icermiyorsa gecersiz yazdirin
        //iceriyorsa mailiniz kabul edilidi yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail = scan.next();

        if (mail.indexOf('@')==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }


    }
}
