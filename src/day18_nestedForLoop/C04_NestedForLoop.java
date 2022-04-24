package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int sayi1 = 5;


        for (int i = 1; i <= sayi1; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");

        }
        for (int i = 1; i <= sayi1 - 1; i++) {
            for (int j = 1; j <= sayi1 - i; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}