package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {

        /*
        farkli bir classs ta calisirken herhangi bir class adini yazip noktaya basarsak
        static adini yazdigimiz class taki tum STATIC class uyelerini gorebilir ve kullanabiliriz

         */

        C02_StaticVariables.staticMethod();       // 10
        System.out.println(C02_StaticVariables.staticSayi);    // 10
        System.out.println(C02_StaticVariables.degersizStaticVar);  // 0
        /*
        Class level variable lara deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz istemezsek deger atamayiz
        Eger deger atamissak Java atadigimiz o degeri kabul eder
        deger atamazsak Java bu variable lara default bir deger atamasi yapar
        int icin --> 0
        String  -- > null
        boolean --> false
        char  --> ''  (hiclik)
         */

        /*
        baska Class taki instance variable 'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();   // 10
         // bu method icinde static sayi = 20 oldu
        System.out.println(obje1.isim);  //mehmet
        System.out.println(obje1.degersizInstanceVar);  // 0

        System.out.println(C02_StaticVariables.staticSayi);  //20

        /*
        farkli  bir Class tan C02 Clasindan method ve variable lari kullandigimda
        C02 Class inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */
    }
}
