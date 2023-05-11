package day08_ifStatements;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

/*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 Kullanicidan bir sifre girmesini isteyin
 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin. */

        // ilk harf büyük mü küçük mü
        // ilk harf A veya z  mi?

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        if (ilkHarf>='A' && ilkHarf<='Z') {  // ilk harfi büyük olan kelimeler
            if (ilkHarf=='A'){
                System.out.println("geçerli şifre");
            }else {
                System.out.println("geçersiz şifre");
            }

        } else if (ilkHarf>='a' && ilkHarf <= 'z') {
            if (ilkHarf=='z'){
                System.out.println("geçerli şifre");
            }else {
                System.out.println("geçersiz şifre");
            }
        }else {
            System.out.println("lütfen ilk karakter için sadece harf kullanın");
        }

    }
}
