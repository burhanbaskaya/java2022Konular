package day11_stringManipulation;

public class C02_Equels {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali" + " Can";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("== ile karsilastir : " + (str1==str2));
        System.out.println("equals ile karsilastir : " + str1.equals(str2));


    }
}
