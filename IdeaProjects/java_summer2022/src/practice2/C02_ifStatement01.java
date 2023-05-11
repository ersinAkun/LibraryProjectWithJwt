package practice2;

import java.util.Scanner;

public class C02_ifStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen Y/N ikilisinden birini giriniz : ");
        char karakter = scan.next().charAt(0);

        if (karakter=='Y' || karakter=='y'){
            System.out.println("YES");

        }else if (karakter=='N' || karakter=='n'){
            System.out.println("NO");
        }else{     // else içine tek satırda yazarsak süslü parantez yazmasakta olur***
            System.out.println("yanlıs giris yaptınız lutfen y veya n giriniz ...");
        }



    }
}
