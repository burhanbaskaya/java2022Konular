package day19_doWhileLoop;

public class C06_OdevSoru2 {
    public static void main(String[] args) {

        // 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin.

        char harf = 'm';

        do {
            System.out.print(harf + " ");
            harf--;

        }while ('m'>=harf && harf>='c');
    }
}
