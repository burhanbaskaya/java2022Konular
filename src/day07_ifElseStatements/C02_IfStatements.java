package day07_ifElseStatements;

public class C02_IfStatements {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }

        if (a>0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

        //Bir if cumlesinin daha anlasilir olmasini istiyorsaniz if body sini {} icine yazmaalisiniz
        // body yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur



        //24. satirdaki kod 15. saatirdaki if dogru olsa da calisir false olsa da calisir
        System.out.println("2. satir da calisti");

    }
}
