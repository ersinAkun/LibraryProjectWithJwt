package day19_scope;

public class C01_InstanceVeriables {
    /*   class icerisinde heryerden kullanmak istediginiz variable lari
         class level da ( class in icinde ama methodlalrin disinda)
         genellikle class level variable lar class in basinda olusturulur(ama sart degil)
         class level daki variable lar icin iki scope vardir
         1- static variables (class variable lari)
         2- istance (static olmayan) variables (obje variable lari)   */


    int instSayi = 20;  // static olmayip class level da oldugu icin instance variable dir

    public static void main(String[] args) {
        int sayi = 10;
      /*  System.out.println(instSayi);
        instance variables static olmadigi icin static kulube uye main method dan direk kullanamayiz
        instance variable' larin diger adi object veriable'dir
        olayisiyla obje olusturursaniz instance variable lari heryerden kullnabilirsiniz
      */
        C01_InstanceVeriables obje1 = new C01_InstanceVeriables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi);  // 20
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra : "+obje1.instSayi);  // 30

        C01_InstanceVeriables obje2 = new C01_InstanceVeriables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi);  // 20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra : "+obje2.instSayi);  // 25

        C01_InstanceVeriables obje3 = new C01_InstanceVeriables();
        System.out.println("obje3 degismeden once : "+obje3.instSayi);  // 20
        obje3.instSayi=40;
        System.out.println("obje3 degismeden once : "+obje3.instSayi); //
        /*
         her obje olustugunda instance (obje) variable 'nin ilk atanan degeri alir

         */

    }

    public static void staticMethod() {

        /* bir methodun iceerisinde olusturulan variable sadece o methodun icinden kullanilabilir
        (local variables)
         */
        /*
         inst sayi=30
         instance variable lara main method disindaki static methodlardanda direk ulasamayiz
        obje olusturursak ulasabiliriz
         */
        C01_InstanceVeriables obje4 = new C01_InstanceVeriables();
        System.out.println(obje4.instSayi);  // 20

    }


    public void staticOlmayanMethod(){
        System.out.println(instSayi);
        /*
        instance variable lar class icerisindeki
         static olmayan methodlardan direk kullanilabilir
         */
    }



}
