package day15_methodCreation;


public class C06_MethodCreationTekrar {

    public static void main(String[] args) {

        int a = 15;
        int b = 25;

        // iki variable'in degerlerini toplayan bir method olusturalim
        // 1.adim : method adini yazalim
        // 2.adim : method'a gondermem gereken argument var mi ?

        ikiSayiCarp(a,b);
        

        
    }

    private static void ikiSayiCarp(int a, int b) {
        System.out.println(a*b);
    }


}
