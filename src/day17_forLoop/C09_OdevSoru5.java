package day17_forLoop;

public class C09_OdevSoru5 {
    public static void main(String[] args) {

        // Kullanicidan 100den kucuk bir tamsayi isteyin. 1den baslayarak
        // girilen sayiya kadar 3 un veya 5 in kati olan sayilari yazdirin

        int sayi = 55;

        for (int i = 1; i <= 55; i++) {

            if (i%3==0){
                System.out.print(i + " ");
            }else if (i%5==5){
                System.out.print(i + " ");
            }

        }
    }
}
