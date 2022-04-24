package day07_ifElseStatements;

public class C02_IfStatementsTekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100){
            System.out.println("istediginiz gerceklesecek");
        }
        if (a<b && a*b<100) System.out.println("istenilen sonuc bulunmayacak");

        System.out.println("2. satir da calisir");

    }
}
