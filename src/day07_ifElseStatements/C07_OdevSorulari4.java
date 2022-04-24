package day07_ifElseStatements;

import java.util.Scanner;

public class C07_OdevSorulari4 {
    public static void main(String[] args) {

        //4- Kullanicidan bir kullanicidan uc kenar uzunlugunu alin eger uc kenar uzunlugu birbirine esi ise
        // ekrana "Eskenar Ucgen " yazdirin. Deilse "Eskenar Degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci kenari giriniz");
        int birinciKenar = scan.nextInt();

        System.out.println("Lutfen ikinci kenari giriniz");
        int ikinciKenar = scan.nextInt();

        System.out.println("Lutfen ucuncu kenari giriniz");
        int ucuncuKenar = scan.nextInt();

        if (birinciKenar == ikinciKenar && ikinciKenar ==ucuncuKenar){
            System.out.println("Eskenar Ucgen");
        }else{
            System.out.println("Eskenar degil");
        }


    }
}
