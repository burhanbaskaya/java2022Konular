package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan 100den kucuk bir tamsayi isteyin.
        // 1 den basliyarak girilen sayiya kadar 3 un kati olan sayilari yazdirin

        int num = 50;

        for (int i = 1; i <= 50; i++) {

            if (i%3==0){
                System.out.print(i + " ");
            }

        }
    }
}
