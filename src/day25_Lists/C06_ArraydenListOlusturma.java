package day25_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {

    public static void main(String[] args) {
        
        // verilen bir array i listeye cevirin
        
        String arr[]= {"A","B","C"};
        List<String> arraydenList = Arrays.asList(arr);

        System.out.println(arraydenList);
        // array den liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add() remove() clear() gibi method lar caistirmak istedigimizde
        // exception olusur

        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("22. satirda list : " +arraydenList);

        arr[1] = "F";

        System.out.println("26. satirda Array : " + Arrays.toString(arr));
        System.out.println("27. satirda list : " +arraydenList);


    }
}
