package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdırın

        //1.adım
        Scanner scan = new Scanner(System.in);

        //2. adım
        System.out.println("lütfen ilk sayıyı girin");

        //3. adım
        double sayi1 = scan.nextDouble();

        //ikinci sayı için 2. ve 3. adımları tekrarlarız
        System.out.println("lütfen ikinci sayıyı girinix");
        double sayi2 = scan.nextDouble();
        System.out.println("girilen sayıların çarpımı:"+sayi2*sayi1);



    }
}
