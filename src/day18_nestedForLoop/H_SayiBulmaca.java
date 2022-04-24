package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_SayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

      /*  Scanner scan = new Scanner(System.in);
        int deger =80;
        int sayi = 0;
        int tahminSayisi = 0;
        System.out.println("Lutfen 1 ile 100 arasinda bir sayi giriniz");

        while (sayi!=deger){
            sayi = scan.nextInt();
            tahminSayisi++;
            if (sayi<deger){
                System.out.println("lutfen buyuk sayi giriniz");
            }if (sayi>deger){
                System.out.println("Lutfen kucuk sayi giriniz");
            }
        }
        System.out.println(tahminSayisi + ". tahminde "+sayi +" sayisini buldunuz");
*/

     //  Random r = new Random(); //random sınıfı
     //  int a = r.nextInt(100);

     //  Scanner scanner = new Scanner(System.in);
     //  int sayi = 0;
     //  int i = 0;

     //  while (!(sayi == a)) {
     //      i++;
     //      System.out.print("Lutfen tahmininizi giriniz : ");
     //      sayi = scanner.nextInt();
     //      if (sayi < a) {
     //          System.out.println("Lutfen sayiyi buyultunuz");
     //      } else if (sayi > a) {
     //          System.out.println("Lutfen sayiyi kucultunuz");
     //      } else {
     //          System.out.println(":-) Bravo " +i + ". tahminde dogru tahmin ettiniz :-) ");
     //      }
     //  }

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);


        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int tahminSayisi = 0;

        while (tutulanSayi!=sayi){
            System.out.print("Lutfen sayiyi tahmin ediniz : ");
            sayi = scan.nextInt();
            tahminSayisi++;

            if (sayi<tutulanSayi){
                System.out.println("Lutfen sayiyi buyultunuz");

            }else if (sayi>tutulanSayi){
                System.out.println("Lutfen sayiyi kucultunuz");
            }

        }
        System.out.println(tahminSayisi +". tahmininizde sayiyi buldunuz : " + sayi);

    }
}
