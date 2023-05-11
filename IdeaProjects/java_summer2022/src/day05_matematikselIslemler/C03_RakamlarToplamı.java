package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 Basamaklı pozitif bir sayı giriniz");  // 5267 girilmiş gibi konu anlatıldı
        int sayi = scan.nextInt();

        int birlerBasamagı = 0;
        int rakamlarToplamı = 0;
        int ilkGirilenSayi = sayi;

        birlerBasamagı = sayi % 10;
        rakamlarToplamı += birlerBasamagı;
        sayi /= 10;

        birlerBasamagı = sayi % 10;
        rakamlarToplamı += birlerBasamagı;
        sayi /= 10;

        birlerBasamagı = sayi % 10;
        rakamlarToplamı += birlerBasamagı;
        sayi /= 10;                            //suanda sayı 5

        birlerBasamagı = sayi % 10;       //5 tir
        rakamlarToplamı += birlerBasamagı;     // 15+5 =20
        sayi /= 10;   //  sayı artık 0 dır.....

        System.out.println(ilkGirilenSayi+"  sayısının rakamlar toplamı :  "+rakamlarToplamı);

    }
}
