package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

           //Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
           // buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.



        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz : ");
        char harf=scan.next().charAt(0);

        /* String sonuc = (harf>='a' && harf <='z') ? ("küçük harf") :
                ("büyük harf veya geçersiz karakter") ;
*/
        String sonuc = (harf>='a' && harf <='z') ? ("küçük harf") :
                       ((harf>='A' && harf <='Z') ? "büyük harf" : "gecersiz karakter ") ;

        System.out.println(sonuc);


    }
}
