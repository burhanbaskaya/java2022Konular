package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        //Jyi yazdiralim
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(" ");
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(" ");
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11));
        System.out.println(str.charAt(12));
        System.out.println(str.charAt(13));

        System.out.println(" "+str.charAt(2)+str.charAt(3));
        System.out.println(" "+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        //son karakteri yazdir
        //String de 14 harf var , son harfin index i 14-1

        System.out.println(str.charAt(14-1));
        System.out.println(str.charAt(14));

    }
}
