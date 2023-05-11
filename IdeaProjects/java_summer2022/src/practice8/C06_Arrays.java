package practice8;

import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {

        /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");
        int[] sayilar = new int[scan.nextInt()];
        farkBul(sayilar);

    }
    public static void farkBul(int[] sayilar) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i+". indeksi giriniz : ");
            sayilar[i] = scan.nextInt();
        }
        int enKucuk = sayilar[0];
        int enBuyuk = sayilar[0];

        for (int each : sayilar) {
            if (enBuyuk < each) {
                enBuyuk = each;
            }
            if (enKucuk > each) {
                enKucuk = each;
            }
        }
        System.out.println("En buyuk ve en kucuk farki = " + (enBuyuk-enKucuk));
    }
}
