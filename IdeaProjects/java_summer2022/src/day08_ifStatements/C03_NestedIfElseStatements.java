package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        /*emeklilik kontrolü yaoan bir program yazınız
        cinsiyet olarak E erkek veya K kadın değişkenlerini kabul etsin
        farklı bir harf veya sembol girilirse hata versin

        emeklilik için kadınlarda yaş sınırı 60 erkeklerde 65 olsun
        negatif veya 80 den büyük yaş girilirse hata mesajı versin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız" +
                "\n Kadın için K erkek için E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>80){
                System.out.println("geçerli yaş giriniz");
            }else if (yas<65){
                System.out.println("emekli olamazsın");
            }else{
                System.out.println("emekli olabilirsin");
            }
        }else if(cinsiyet=='K'){
            if (yas<0 || yas>80){
                System.out.println("geçerli yaş giriniz");
            }else if (yas<60){
                System.out.println("emekli olamazsın");
            }else{
                System.out.println("emekli olabilirsin");
            }

        }



    }
}
