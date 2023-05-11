package practice3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_nestedIfElseTernary {
    public static void main(String[] args) {

                                 /*
                        0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
                       kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
                       cikis "Gecersiz" olmalidir
                       NestedIf ve Ternary kullanarak 2 yolla da cozunuz
                     */
    /*    Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen bir rakam giriniz :");

        int rakam = scan.nextInt();
        //   if (rakam>=0 && rakam <=9){
         //  System.out.println("giris gecerli");
        // }else System.out.println("Geçersiz  ");

        System.out.println((rakam>=0 && rakam <=9) ? "giris gecerli .." : "gecersiz ..");               */

        int sayi = 1;
        String sonuc = "";

        if (sayi>=0 && sayi<=9){
            if (sayi==9){sonuc = "dokuz";}
            else if (sayi==8) {sonuc="sekiz";}
            else if (sayi==7) {sonuc="yadi";}
            else if (sayi==6) {sonuc="altı";}
            else if (sayi==5) {sonuc="bes";}
            else if (sayi==4) {sonuc="dort";}
            else if (sayi==3) {sonuc="uc";}
            else if (sayi==2) {sonuc="iki";}
            else if (sayi==1) {sonuc="bir";}
            else sonuc = "sifir";
        }else sonuc = "gecersiz";

        System.out.println("sonuc = " + sonuc);

        System.out.println("-------*----------*--------*---------");


        int n = 5;
        String result = n==9 ? "dokuz" : n==8? "sekiz" : n==7 ? "yedi": n==6 ? "altı" :
                n==5 ? "bes": n==4 ? "dort": n==3 ? "uc": n==2 ? "iki": n==1 ? "bir": n==0 ? "sıfır" :"gecersiz ..";
        System.out.println("result = " + result);


        }


    }

