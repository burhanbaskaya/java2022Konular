package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String> sinifList = new HashMap<>();
        sinifList.put(101,"Kerim, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 1900");
        sinifList.put(103,"Furkan, Yan, C#, 2000");
        sinifList.put(104,"Ayse, Kan, C#, 2001");
        sinifList.put(105,"Fatma, Han, Java, 2002");

        return sinifList;
    }
}
