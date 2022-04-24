package day12_stringManipulation;

public class C01_indexOfTekrar {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.

       //String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
       //String kelime = "ac";

       //int ilkKullanim = cumle.indexOf(kelime);
       //System.out.println(ilkKullanim); //11
       //int ikinciKullanim = cumle.indexOf(kelime, ilkKullanim+1);

       //if (ilkKullanim==-1){
       //    System.out.println("Girilen kelime cumlede kullanilmamis");
       //}else if (ikinciKullanim==-1){
       //    System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
       //}else {
       //    System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
       //}

        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.
        ///////////////////////////////////////////////////////////////

       // String cumle2 = "Bugun hava cok guzel, gezmek de guzel";
       // String kelime2 = "guzel";

       // int ilkKullanim2 = cumle2.indexOf(kelime2);
       // System.out.println(ilkKullanim2);
       // int ikinciKullanim2 = cumle2.indexOf(kelime2, ilkKullanim2+1);


       // if (ilkKullanim2==-1){
       //     System.out.println("Girilen kelime cumlede kullanilmamis");
       // }else if (ikinciKullanim2==-1){
       //     System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
       // }else {
       //     System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
       // }

        /////////////////////////////////////

        String cumle3 = "Bugun hamburger yedim, hem de ne yedim";
        String kelime3 = "yedim";

        int ilkKullanim3 = cumle3.indexOf(kelime3);
        System.out.println(ilkKullanim3);
        int ikinciKullanim3 = cumle3.indexOf(kelime3, ilkKullanim3+1);

        if (ilkKullanim3==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ikinciKullanim3==-1){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }




    }
}
