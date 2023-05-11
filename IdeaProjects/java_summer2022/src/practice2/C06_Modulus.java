package practice2;

import java.util.Scanner;

public class C06_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen 5 basamaklı sayı giriniz ");
        int num = scan.nextInt();

        int ilkIki = num/1000;
        int sonIki = num%100;  //100e bolumunden kalanı verir

        ilkIki = ilkIki%10+ilkIki/10;
        sonIki = sonIki%10+sonIki/10;
        System.out.println(ilkIki+sonIki);


    }
}
