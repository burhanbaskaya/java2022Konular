package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

        // Verilen bir listede istenen iki index deki elementlerin
        // yerini degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex = 6;
        int ikinciIndex = 7;

        sayilar = swapElements(sayilar,ilkIndex,ikinciIndex);

        System.out.println(sayilar);
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // Bir temp sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin

        int temp =0;

        if (sayilar.size()>ilkIndex && sayilar.size()>ikinciIndex){
            temp =sayilar.get(ilkIndex);

            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex,temp);
        }else{
            System.out.println("Sinirin otesinde bir index girdiniz");
        }



        return sayilar;
    }
}
