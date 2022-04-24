package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        String kelimeler[] = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); //[Java, gun, gectikce, guzellesiyor]
        System.out.println(kelimeler[1]); // gun

        String gectikce[]= str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); // [Java gun ,  guzellesiyor]

        String harfler[]= str.split("");
        System.out.println(Arrays.toString(harfler)); // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]



        harfler =terstenYazdir(harfler);
        System.out.print(Arrays.toString(harfler));


    }

    public static String[] terstenYazdir(String[] harfler) {

        String tersHarfler[]= new String[harfler.length];
        System.out.println(Arrays.toString(tersHarfler));

        for (int i = 0; i < harfler.length; i++) {

            tersHarfler[i]=harfler[harfler.length-1-i];

        }
        return tersHarfler;
    }
}
