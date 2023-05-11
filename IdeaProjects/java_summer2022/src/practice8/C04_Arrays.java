package practice8;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String input = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz." ;
        input=input.replaceAll(" ","");
        System.out.println(input);

        String[] kelimeler = input.split("");
        System.out.println("Inputtaki bosluklar haric character sayisi "+kelimeler.length);
       // System.out.println(Arrays.toString(kelimeler));

        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] =str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);
        String charcter [] = str1.split("");
        System.out.println("charcter sayisi  = " + (charcter.length-boslukSayisi));
    }
}
