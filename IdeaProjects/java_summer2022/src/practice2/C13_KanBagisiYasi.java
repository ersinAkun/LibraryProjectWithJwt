package practice2;

import java.util.Scanner;

public class C13_KanBagisiYasi {
    public static void main(String[] args) {

                    /*
            Problem tanimi :
            Kullanicidan  yasini ve kilosunu aliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.


             */
        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("kilonuzu giriniz : ");
        int kilo = scan.nextInt();

        if (yas>0 && yas<18){
            System.out.println("yasi 18 den kucuk olanlar kan bağısı yapamaz ...");
        }else if (yas>=18){
            if (kilo>0 && kilo<50){
                System.out.println("kilonuz 50 de az oldugu icin kan bağısı yapamazsınız ..");
            }else System.out.println(" kan bagısı yapabilirsiniz ..");

        }




    }
}
