package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCasetoUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        //biz string metodlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.toLowerCase().charAt(5); bole yazdirdigimizda sonuc artik string deil char olacaktir.
        //Stringde yapmak istedigimiz degisiklikleri yapip sonra charAt() method unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        String str2 = "TechProEducation";

        System.out.println(str2.toLowerCase(Locale.forLanguageTag("tr")));
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("tr")));



    }
}
