package day49_maps;

public class OrnekCarpimTablosu {
    /*
    input = 5
    output = 1  2  3  4  5
             2  4  6  8 10
             3  6  9 12 15
             4  8 12 16 20
             5 10 15 20 25
     */
    public static void main(String[] args) {
        int sayi = 5;

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }



    }
}
