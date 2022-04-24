package day02_variables;

public class C05_InterviewQuestion {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int num=0;
        System.out.println("İlk degerler");
        System.out.println(sayi1);
        System.out.println(sayi2);

        num=sayi2;
        sayi2=sayi1;
        sayi1=num;
        System.out.println("Degistikten sonraki deger");
        System.out.println(sayi1);
        System.out.println(sayi2);

        int num1=25;
        int num2=35;
        System.out.println("Degismeden onceki degerler");
        System.out.println(num1);
        System.out.println(num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Degistikten sonraki degerler");
        System.out.println(num1);
        System.out.println(num2);


    }
}
