package day42_abstractClass_interfaces;

import org.w3c.dom.ls.LSOutput;

public interface I03_Interfaces {

    int SAYI=20;


   /* int sayi;
       Interface lerde tum variable'lar public static ve final dir
       Dolayisiyla sonradan deger atama sansimiz yoktur
       Bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

       Bir Interface bir class'i parent edinemez

    */

        void yakit();
        /*
        Interfece icerisindeki her method
        public ve abstract ozelliklerine sahiptir

        abstract bir method'un body 'si olmasi mumkun degildir
        Java sonradan Developer larin istegi uzerine kismi bir update
        yapmistir.

        Bir interface e sonradan bir abstract method eklerseniz o interfece i
        daha once implement etmis tum class lara gidip hepsinde yeni eklenen
        methodu override etmeniz gerekir
        Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir
        Bunun icin Jsva , java 8 den itibaren  interface lere
         sonradan body si olan method eklenmesine izin vermistir

        Bu method larin body si olsada interface in yapisi geregi bu method lar concrate
        denmez .. body si olan bu methodlar istisna olarak kabul edilebilir
         */

        public void motor();
        public abstract void teker();

        static public void aku(){

        }
    
}
