package day12_stringManipulation;

import java.util.Scanner;

public class C07_OdevSoru1 {

    //Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini kontrol edin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle =scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf = scan.next();

        int arananHarf = cumle.indexOf(harf);
        System.out.println(arananHarf);

        if (arananHarf==-1){
            System.out.println("Aranan harf cumlede yoktur");
        }else{
            System.out.println("Aranan harf cumlede vardir");
        }
    }
}
