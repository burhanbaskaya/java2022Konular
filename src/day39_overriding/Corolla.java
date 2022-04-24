package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz = "Corolla max 200 km hiz yaparlar";
    protected String yakit = "Corolla benzinli veya elektriklidir";
    protected String model = "Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi() { System.out.println("Corolla 5.6 lt yakit tuketirler");}

    public void vitesSayisi() { System.out.println("Corolla 5 viteslidir");}

    public static void main(String[] args) {

        /*
        Data turu ve constructor farkli oldugunda
        COnstructor calistigi icin obje
        Constructor'in oldugu Class ozelliklerini tasir
        Ancak Data turu Parent clss secildigi icin
        variable'lar data turunun secildigi class
        ve onun parent class'larindan deger alabilir

        Method'lar icin ise yine Data turunun oldugu class'a gidebilir
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol
        */


        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // Araba
        System.out.println(arb1.hiz); // Corolla
        System.out.println(arb1.yakit);  // Corolla
        System.out.println(arb1.marka);  // Toyota
        System.out.println(arb1.sirketMerkezi);  // Toyota
        System.out.println(arb1.model);  // Corolla
        arb1.motor(); // Corolla


        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // Araba
        System.out.println(arb2.hiz); // Toyota
        System.out.println(arb2.yakit);  // Araba
        System.out.println(arb1.marka);  // Toyota
        System.out.println(arb1.sirketMerkezi);  // Toyota
        // System.out.println(arb2.model);  // CTE
        arb2.motor(); //


        Araba arb3 = new Araba();
        System.out.println(arb3.hareket); // Araba
        System.out.println(arb3.hiz); // Araba
        System.out.println(arb3.yakit);  // Araba
        System.out.println(arb3.marka);  // Araba
        // System.out.println(arb3.sirketMerkezi);  // Toyota
        // System.out.println(arb3.model);  // Corolla
        arb3.motor(); //
    }

}
