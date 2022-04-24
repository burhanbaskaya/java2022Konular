package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        String kelime = "Nalan";
        palindromeKontrolEt(kelime);




    }

    private static void palindromeKontrolEt(String kelime) {
        String terstenKelime ="";

        for (int i = kelime.length()-1; i >= 0; i--){

            terstenKelime += kelime.charAt(i);
        }

        System.out.println("Girdiginiz kelimenin tersten yazdirilisi : " + terstenKelime);

        if (kelime.equalsIgnoreCase(terstenKelime)){
            System.out.println("Girilen kelime Palindrome dir");
        }else{
            System.out.println("Girilen kelime Palindrome degildir");
        }

    }
}
