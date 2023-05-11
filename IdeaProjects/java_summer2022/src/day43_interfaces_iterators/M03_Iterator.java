package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);   // [10, 20, 30]

        // listedeki tum elementleri INDEX KULLANMADAN 3 artiralim
        for (Integer each : liste) {
           each+=3;
            System.out.print(each+" ");
        }
        System.out.println("");
        System.out.println(liste);
        /*
        Java index yapisi olmayan collection lardaki elementlere ulasmak veya
        degistirmek icin Iterator interface'ini olusturmustur.

        Iterator Interface oldugundan ondan obje uretmemiz mumkun degildir
        Bunun yerine bize Iterator dönduren liste.iterator() methodunu kullaniyoruz

         */
        System.out.println(liste);   // [10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next());  // 10
        System.out.println(it1.next());  // 20
        System.out.println(it1.next());  // 30
     //   System.out.println(it1.next());  // 30 dan sonra element kalmadigindan next() RTE verir

        //Iterator de geri donuz yok adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir Iterator olusturmamiz gerekir


        // [10, 20, 30]
        Iterator it2 = liste.iterator();
        //yeni iterator u kullanarak listenin tum elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); //   []   // iterator ile elementleri gezip remove yapinca
                                             // liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        // [10, 20, 30]
        System.out.println("Yeniden liste : "+liste);
        Iterator it3 = liste.iterator();

        while(it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop 'tan sonra  liste : "+liste);

        /*
        Goruldugu gibi iterator kullanarak yapabildigim
        1-- tum collectionu elementlerini yazdirmak
        2-- tum collection elementlerini silmek

        Bu da bize yetmez
         */

    }
}
