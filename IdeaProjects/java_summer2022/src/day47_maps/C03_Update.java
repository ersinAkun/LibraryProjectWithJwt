package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {


       /*
        map.contains(key) ==> verdigimiz key' in map'de olup olmadigini boolean olarak doner
        map.contains(value) ==> bir butun olarak value' nun map'de olup olmadigini doner

        ONEMLI NOT : map.contains(value) value'nin icindeki bir parcayi bulmada ise yaramaz
                     Eger value icindeki bir parcayi aratmak istiyorsak
                     map uzerinde manipulation yapmamiz lazim

         map.get(key) ==> verilen key'e ait degeri dondurur
        */
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));  // false

     //Verilen map'de JDev degerlerini  JavaDeveloper olarak degistirelim
     // map'lerde replace tum value yu degistirmek isterssek kullanilabilir
     // kismi degisikliklerde kullanamayiz

        Collection<String> valueCollection = sinifListMap.values();
       // ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        for (String each : valueCollection) {
            each=each.replace("JDev","Java Developer");
            System.out.println(each);
        }

        System.out.println(sinifListMap);

        //Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifList.Map.put((101, Ali,Can, Java Developer)

        // bunu yapabilmek icin herbir key'e ve ona ait value'ya ihtiyacimiz var
        Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each : keySeti) {

            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            Biz key'lerin tamamini aaldik
            herbir key'in value sunu getirdik
            value uzerinde degisikligi yapip
            yeni halini put(key,yeni deger) ile map'a koyduk
             */
        }
        System.out.println(sinifListMap);
    }
}





