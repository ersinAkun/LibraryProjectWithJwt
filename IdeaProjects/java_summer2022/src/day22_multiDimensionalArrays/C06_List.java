package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array i array yapan sembol []
        arrayList de ise <> diamond(elmas) kullaniriz        */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);  // []

        // bir List'e eleman eklemek isersek
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse"));  //true


          /* String de bir method calistirdigimizda assing yapmazsak String degismiyordu

          String isim="Suleyman"
          isim.toUpperCase();  // SULEYMAN
          sout(isim);  ---> Suleyman
           */
        System.out.println(isimler);  // [Basak, Ayse]

        /* List in tek kotu yapisi array alt yapisini kullandigi icin elemanlari birer birer
        eklemek zorunda olmamizdir
         */









    }
}
