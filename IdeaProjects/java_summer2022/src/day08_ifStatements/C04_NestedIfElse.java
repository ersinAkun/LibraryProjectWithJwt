package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

      /* Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
                Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
                Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
                Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();

        //sayının 5 e bölünüp bölünnmemesi
        // sayının son basamağının 0 olup olmaması

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lütfen 4 basamaklı sayı girin");
        } else if (sayi % 5 == 0) {  //sayı 4 bas ve 5 etam bölünebiliyor
            if (sayi % 10 == 0) {
                System.out.println("5'e bölünen çift sayı");
            } else {
                System.out.println("5’e bölünen tek sayı");
            }


        } else {     //sayi 4 bas ama 5 e bölünemiyor
            System.out.println("lütfen geçerli bir tercih giriniz");


        }
    }
}