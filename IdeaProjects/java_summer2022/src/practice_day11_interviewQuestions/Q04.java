package practice_day11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
      // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
      //bunu kart sifre kontrol de de kullabilirinisz
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String sifre ="ersin.bey123";
          int girisSayisi=3;

         // System.out.println("Bir sifre giriniz");
          while(true){
              System.out.println("sifre gir");
              String girilenSifre=scan.nextLine();

              if (sifre.equals(girilenSifre)){
                  System.out.println("Sifre basarili dogru");
                  break;
              }else{
                  System.out.println("sifre yanlis");
                  girisSayisi--;
                  System.out.println("kalan giris hakkin "+girisSayisi);
              }
              if (girisSayisi==0){
                  System.out.println("giris hakki bitti kart bloke "+ girisSayisi);
                  break;
              }

          }
          System.out.println("Menu Aciliyor, lutfen bekleyiniz");
      }


}
