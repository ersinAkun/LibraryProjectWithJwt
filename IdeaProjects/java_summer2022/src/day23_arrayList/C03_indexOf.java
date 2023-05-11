package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);          //[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram"));  // 1
        System.out.println(urunler);          //[Nutella, Ikram, Cekirdek, Cay]

        /*
        index of  methodu bize bilgi donduren bir methoddur
        listemizi degistirmez
         */
        System.out.println(urunler.lastIndexOf("Ikram"));   //1

        // index of methodu urunu aramata  0 . indexten
        //last index of methodu ise aramaya son index ten baslar
        // arama bitip urun bulundugunda ikiside, bulunan urunun index'ini verir


        urunler.add("Ikram");
        System.out.println(urunler);          //[Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));  //1
        System.out.println(urunler.lastIndexOf("Ikram"));  //4


    }
}
