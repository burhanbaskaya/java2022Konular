package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        //Verilen iki harf ve aralarindaki harfleri yazdran bir kod yaziniz

        char ilkHarf = 'm';
        char sonHarf = 't';

        for (char i = ilkHarf; i <= sonHarf; i++) {
            System.out.print(i + " ");

        }

        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;

        //baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        //tum sayilari yazdirin

        for (double i = baslangic; i < bitis; i+=0.2) {
            System.out.print(i + " ");

        }


    }
}
