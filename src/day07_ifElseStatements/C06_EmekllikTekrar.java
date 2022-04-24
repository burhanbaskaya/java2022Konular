package day07_ifElseStatements;

import java.util.Scanner;

public class C06_EmekllikTekrar {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya buyukse emekli olabilirsin
        //65 ten kucukse emekli olamazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >= 65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsiniz");
            System.out.println(65-yas + " sene sonra emekli olabilirsiniz");
        }
    }
}
