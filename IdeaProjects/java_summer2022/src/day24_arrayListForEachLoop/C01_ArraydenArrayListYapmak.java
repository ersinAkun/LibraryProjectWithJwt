package day24_arrayListForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"Ismail", "Nurullah", "Fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde tek tek eklemek yarine
        Array olusturup bunlari list e cevirmek daha protik olabilir
        1- Lop ile array'deki tum elementleri List e atabiliriz
        2- Arrays.asList() kullanabiliriz
            ancak 2. methodun 2 tane kotu yan etkisi var
            - Arrays class i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla List te olan add remove gibi size i degistiren methodlar
             bu sekilde olusturulan list lerde kullanilmaz
             - kaynak olan Array ile urun olan List ozdeslestirilir
              birinde yapilan degisilik otomatik olaraak digerine de islenir
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

        // 1. yan etki:
        // sinifList.add("Erdi"); //UnsupportedOperationException
        // sinifList.remove(1); // UnsupportedOperationException

        // 2. yan etki:
        arr[1]="Emre";
        System.out.println("degisim sonrasi array "+Arrays.toString(arr));  //[Ismail, Emre, Fatih]
        System.out.println("Array i degistirince List : "+sinifList);  // [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("list i degistirince list :"+sinifList); //[Utku, Emre, Fatih]
        System.out.println("listi degistirince array : "+Arrays.toString(arr));  //[Utku, Emre, Fatih]




    }
}



