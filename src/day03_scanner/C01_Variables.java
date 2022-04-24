package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulİsmi = "Yildiz Koleji";
        System.out.println(okulİsmi);//Yildiz Koleji

          char ilkHarf;
          ilkHarf = 'H';
        System.out.println(ilkHarf);

        int num1 = 10, num2 = 20;
        System.out.println(num1 + num2);


        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Mehmet
        //  soyisminiz : Bulutluoz
        //  seklinde yazdirin

        String isim = "Kerim";
        String soyİsim = "Topac";
        System.out.println("isminiz : " + isim);
        System.out.println("soyisminiz : " + soyİsim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        short num3 = 20;
        double num4 = 30;
        System.out.println(num3 + num4);//50.0

        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin



        //5 – char data turunde bir variable olusturun ve yazdirin

        char ozelKarakter = '#';
        System.out.println(ozelKarakter);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int num5 = 20;
        char harf = 'a';
        System.out.println(num5 + harf);
    }
}

