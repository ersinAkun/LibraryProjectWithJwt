package lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t-> "Logic",(t,u)-> "Logic"
        Bu yapiya "lambda expression"

    2)  Functional Programming kapsaminda "lambda expression" kullanilabilir ama onerilmez
        "lambda expression" yerine "Method Referrence" tercih edilir.

    3)  "Method Referrence" kullanimi "Class name :: Method Name"
         Ayni zamanda kendi Class'larinizi da kullanabilirsiniz
         Ornegin bir Animal Class'iniz var ve bu class "eat()" methoduna sahip ==>  "Animal :: eat"

     */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);


        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        getMaxEleman(liste);
        getMinEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);
    }
  //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void  ciftElemanlariYazdirFunctional(List<Integer>list){
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //1. YOL
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer>list){
      Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);

    }

    //2.YOL
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer>list){
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    //3.YOL
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer>list){
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer>list){
       Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer>list){
       Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    public static void getMinEleman(List<Integer>list) {
        Integer min = list.stream().distinct().reduce(Math::min).get();
        System.out.println("getMinEleman : "+min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer>list){
       Integer min = list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
       List<Double>sonuc = list.
                           stream().     //gerekli methodlari kullanmamizi saglar
                           distinct().    // tekrarli olanlari almaz
                           filter(t->t>5).   // kosula gore filtreleme yapar
                           map(Utils::yarisiniAl).  // herbir elemanindegerini degistirmeye yarar
                           sorted(Comparator.reverseOrder()).  //siralama yapar
                           collect(Collectors.toList());   // elemanlari collectiona cevirir
        System.out.println(sonuc);
    }


}




