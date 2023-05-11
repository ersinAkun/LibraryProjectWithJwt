package day03_scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismi isteyin
        // girilen ismi isminiz: şeklinde yazdıralım
        // insan dünyasından bilgisayar dünyasına değer almak için

        Scanner scan = new Scanner(System.in);   //  scanner objesi oluşuruldu
                // kullanıcıya ne istediğimizi söyleyelim
        System.out.println("lütfen isminizi giriniz");  //2.adım

            //3.adım***** olusturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
            //4.oluşturacağımız uygun bir variable a atayalım
        String kullanıcıIsmi = scan.next();               // adım 3 ve 4 burada
        System.out.println("Isminiz:  "+kullanıcıIsmi);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("lütfen icra ettiğiniz mesleği yazınız!!");
        String meslekAdi = scan.next();
        System.out.println("mesleğiniz  :  "+meslekAdi);


    }
}
