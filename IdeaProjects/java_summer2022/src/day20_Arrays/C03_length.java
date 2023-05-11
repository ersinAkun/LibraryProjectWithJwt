package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki sekilde array olusturulabilir
        int sayilar[]={1,2,3};

        String harfler[] = new String[4];

        System.out.println("sayilar arrayinin uzunlugunu : "+ sayilar.length);  //3
          // String length() methodunda parantez var. array 'in kinde yok

        System.out.println("Harfler array inin uzunlugu : "+ harfler.length);  // 4
        System.out.println(Arrays.toString(harfler));  //[null, null, null, null]

        //harfler array inin son elmentini yazdiralim
        System.out.println(harfler[harfler.length-1]);  //null

        System.out.println(harfler[5]); //  .ArrayIndexOutOfBoundsException

    }
}
