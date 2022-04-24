package day15_methodCreation;



public class C07_MethodCreationTekrar {

    public static void main(String[] args) {

        isimYazdır();



    }

    private static void adresYazdır() {
        System.out.println("Saklıkent mah. Tuncay sok.");
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }

    private static void telefonYazdir() {
        System.out.println("532 456 34 34");
        adresYazdır();
    }

    private static void isimYazdır() {
        System.out.println("Ali Kemal");
        telefonYazdir();
    }
}
