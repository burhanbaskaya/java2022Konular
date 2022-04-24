package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    // Br class'i child class yaptigimizda
    // parent class daki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifier'i uygun bir modifier yapilmalidir



    Child(){
        super();
        System.out.println("child parametresiz cons");
    }
    Child(int s){
        // child class da tum constructor'larin ilk satirina
        // Java'nin yerlestirdigi constructor Parametresiz dir
        // yani super()

        System.out.println("child class parametreli cons");
    }

    Child(int sayi1,int sayi2){
        // Eger parent clss dan parametrsiz constructor'u
        // deil de baska bir constructor!i calistirmak isterseniz
        // bunu child class!daki contructor'in ILK SATIRINA yazmaliyiz
        super(sayi1, sayi2);
        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {

        Child child = new Child(5,8);
    }
}
