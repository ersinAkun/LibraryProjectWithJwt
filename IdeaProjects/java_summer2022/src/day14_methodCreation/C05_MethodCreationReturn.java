package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        /* eger bir class ın icerisinde herhangi bir hesaplama yapıp
        bunu da kalıcı olarak saklamak istersek kodumuzu sade ve anlasılır tut-mak icin
        islemi bir method da yapıp sonucunu main methoda dondurebiliriz budurumda
        return typ ı void olmayan bir methodun sonucunu main methoddda bir variable a atama yaparsak
        programın geri kalanında bu yeni degeri kullnma sansımız olur
         */

        //kullanıcıdan sehir ismini ve dogum tarihini alın
        //bunları prog. kullanacağımız formatta bize donduren bir method  olusturun
        //sehir ismini programımızda büyük harf olarak ;
        //tarihi ise 2022-06-30 seklind ekullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("girdiginiz sehir  :"+sehir);
        System.out.println("girdiginiiz tarih :"+tarih);

    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih=yil+"-";
        }else{
            System.out.println("yil icin gecerli bir sayi yazmalısınız (1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay = scan.nextInt();
        if (ay<=0||ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir ");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("lütfen ayin kacıncı gunu oldugunu tamsayi olarak giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("gun no olarak 1-31 arasinda sayi giriniz");
        }else if (gun<10){
            tarih=tarih+"0"+gun;
        }else{
            tarih=tarih+gun;
        }
            return tarih;
    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sehir adı giriniz");
        String sehirAdi=scan.next().toUpperCase();
    return sehirAdi;
    }

}