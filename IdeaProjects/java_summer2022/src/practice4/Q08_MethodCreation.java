package practice4;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {

         /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
        Scanner scan=new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("İşlem Menüsü\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();


        if(secim == 1) {
            System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
        }
        else if(secim == 2) {
            System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }
        else {
            System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
        }



    }
}
