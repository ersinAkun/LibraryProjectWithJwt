package practice8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C05_ArrayList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        Scanner scan = new Scanner(System.in);
        Random rnd=new Random();

        List<String> isimListesi= new ArrayList <> ();
        isimListesi.add("ersin akun");
        isimListesi.add("turker akun");
        isimListesi.add("ahmet kalaycioglu");
        isimListesi.add("hatice aydin");

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine().trim();
        isim=isim.replaceAll(" ","");

            if (isimListesi.contains(isim)){
                isim+=rnd.nextInt(100);
                System.out.println("Kullanici adi daha onceden alinmis.\nyeni kullanici adiniz: "+isim);
            }else{
                System.out.println("Kullanici adiniz basariyla kaydedildi");
            }

        System.out.println(isim);
    }
}
