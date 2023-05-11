package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /* Binary search java da eleman aramanin kisa yoludur
        Ancak binary search 'in calismasi icin once Array in sirali hale getirilmesi gerekir
        Eger siralama yapmadan binarysearch  yaparsaniz
        sonucu bulamayabilir ya da yanlis bulabilirsiniz
         */

        String [] harfler = {"Y", "B", "D","G", "G", "O", "A"};
        String arananHarf = "A";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));   //-1

        System.out.println(C03_Contains.contains(harfler,arananHarf));  //true

        //binarysearch bize aradigimiz elemanin index'ini dondurur
        //array sirali olmadigi icin arama sonucun udogru bulamayabilir
        // emin olmak icin sort yapmak lazim
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


    }
}
