package practice6;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
         /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan (girilen sayi haric) sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1'den büyük bir tam sayı giriniz : ");
        int input = scan.nextInt();
        int karelerToplami = 0;

        for (int i = 1; i <input ; i++) {
            karelerToplami+= i*i;
        }
        System.out.println("kareler toplami = "+ karelerToplami);



    }
}
