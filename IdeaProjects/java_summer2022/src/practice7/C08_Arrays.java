package practice7;

import java.util.Arrays;
import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) {

         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        String bolunenler = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("8 Elemanli array icin degerleri sirasiyla giriniz");
        int sayac = 0;
        int[] sayilar = new int[8];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i+". indexindeki sayiyi giriniz ");
            sayilar[i] = scan.nextInt();

            if (sayilar[i] % 3 == 0) {
                bolunenler += sayilar[i] + ", ";
                sayac++;
            }

        }
        System.out.println("olusturulan Array : " + Arrays.toString(sayilar));
        System.out.println("3 e bolunebilenler : " + bolunenler+"  (3'e bolunen sayi adedi "+sayac+")");


    }
}
