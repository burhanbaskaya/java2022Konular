package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_OdevSoru04 {

    //kullanicidan SDET kisaltmasindaki harflerden birini yazmasini iste
    //kullanici S girerse "Software"
    //D girerse "Develper"
    //E girerse "Engineer"
    //T girerse "In Testing" yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini yaziniz");
        char harf = scan.nextLine().toUpperCase().charAt(0);

        switch(harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Develper");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen dogru harf giriniz");





        }

    }
}
