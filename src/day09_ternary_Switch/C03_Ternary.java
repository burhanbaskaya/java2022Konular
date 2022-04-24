package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=1400;
        //verilen sayinin 3 veye daha cok basamakli olup olmadigini kontrol eden ve yazdiran bir ternary olusturun

        String sonuc = sayi>=100 ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";


        System.out.println("Girdiginiz sayi analizi : " + sonuc);



    }
}
