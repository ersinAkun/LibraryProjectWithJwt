package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // 50 ye eşit -60 dan küçükse  "C",
        // 60 a esit veya buyuk-80 den kucuk  "B",
        // 80’e esit veya uzerinde ise "A"
        // gecersiz not girildiginde uyarı verelim

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 0 dan 100e kadar bir not giriniz");
        double note = scan.nextInt();

        if (note<0 || note>100){
            System.out.println("lütfen geçerli bir not giriniz");
        } else if (note<50) {  //bu satıra geldiysek notumuz 0-100 arasındadır
            System.out.println("notunuz : D");
        } else if (note<60) {  //bu satıra geldiysek notumuz 50 ile 00 arasındadır
            System.out.println("notunuz : C");
        } else if (note<80) {
            System.out.println("notunuz : B");
        } else {
            System.out.println("notunuz : A");
        }


    }
}
