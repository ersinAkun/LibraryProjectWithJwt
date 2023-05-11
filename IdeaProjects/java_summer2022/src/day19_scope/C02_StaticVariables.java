package day19_scope;

import java.util.Scanner;

public class C02_StaticVariables {

    static int staticSayi = 10;
    String isim = "Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVar;
    /*
    class level daki variable lara deger atamasak da java kabul ediyor
     */

    public static void main(String[] args) {
        /*
         bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir
         */
        System.out.println(staticSayi);  //10
        staticMethod();   //10
        staticSayi = 12;
        System.out.println(staticSayi);  //12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);  // 20
        System.out.println("-------------");
        staticMethod(); //20
        /*
        instance bir variable degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        static variable da ise classs in en basindan baslayarak
        istenen satira kadar kodu takip edip
        static variable in
         */

    }
    public static void staticMethod(){
        System.out.println(staticSayi); // 10

    }


    public void staticOlmayanMethod(){
        /*
        static variable lar class icerisinden heryerden ulasilabilir
        static olsun veya olasin tum methodlar static variable lari gorebilir ve degistirebilirler
        farkli methodlarda static variable in hangi degeri alacagini bilmek istiyorsak
        class  in basindan itibare kodun calismasini takip etmeliyiz method ne zaman cagirilirsa o anki
        static variable degerini method da kullanabiliriz
         */
        System.out.println(staticSayi);  //12
        staticSayi=20;

    }

}
