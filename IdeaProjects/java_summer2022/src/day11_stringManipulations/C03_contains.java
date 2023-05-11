package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa
        "lutfen gmail adresi giriniz", @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen email yazınız");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("email adresiniz kaydedildi ");
        }else{
            System.out.println("lütfen yazımı kontrol edin");

        }
    }
}
