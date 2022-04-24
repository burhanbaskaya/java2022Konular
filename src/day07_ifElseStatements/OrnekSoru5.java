package day07_ifElseStatements;

import java.util.Scanner;

public class OrnekSoru5 {
    public static void main(String[] args) {
        //Kullanıcıdan 3 not değeri alıp, bu notların ortalamasını hesapladıktan sonra ortalama 50 puanın altındaysa
        // KALDI 50 ve üzerinde ise GEÇTİ yazdıran java programı

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sinav notlarinizi giriniz");
        int not1 = scan.nextInt();
        int not2 = scan.nextInt();
        int not3 = scan.nextInt();
        int ort = (not1 + not2 + not3) / 3;
        System.out.println("Notlarin ortalamasi : " + ort);

        if (ort>50){
            System.out.println("GECTİ");
        }
        if (ort<50){
            System.out.println("KALDİ");
        }
    }
}
