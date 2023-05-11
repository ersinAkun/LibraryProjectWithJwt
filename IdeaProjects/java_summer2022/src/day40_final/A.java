package day40_final;

import org.w3c.dom.ls.LSOutput;

public class A {
    static String isim = "Cuneyt";
    final static String OKUL = "Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa baska class'lardan veya
    icinde oldugumuz class'lardan bu variable'a
    baska deger atanmasi mumkun degildir

    Mademki degeri degistirilemiyor
    genelde static de yaparak bu variable 'a erisim kolaylastirilabilir.
    ve genelde static final olarak belirlenen
    variable isimleri BUYUK HARFLE yazilir

     */

         final void finalMethod() {
             System.out.println("Final methodlar override edilemez ");
      /*
      Bir method'u final larak isaretlerseniz
      bu method degistirilemez demektir.

       */
         }
}
