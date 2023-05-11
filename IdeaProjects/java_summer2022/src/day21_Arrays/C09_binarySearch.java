package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        binary search methodu siralanmis array de aradigimiz elementin index ini dondurur

        ya aradigimiz element array de yoksa ?
        (String de indexOf() bizze olmayan elementler icin -1 donduruyordu )

         Aradigimiz element array de yoksa java hem olmadigini
         hem de olsaydi nerede olacagini bize dondurur

         olmadigini ifade icin - kullanir
         olsaydi nerede olacagini belirtmek icin siralama kullanir
         */

        int[] sayilar={3,7,15,4,27,10,};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));  //  [3, 4, 7, 10, 15, 27]
        //varsa index,  yoksa  - sira

        System.out.println(Arrays.binarySearch(sayilar,4));  // 1

        System.out.println(Arrays.binarySearch(sayilar,15));  // 4

        System.out.println(Arrays.binarySearch(sayilar,11));  //-5

        System.out.println(Arrays.binarySearch(sayilar,6));  // -3

        System.out.println(Arrays.binarySearch(sayilar,-100));  //-1




    }
}
