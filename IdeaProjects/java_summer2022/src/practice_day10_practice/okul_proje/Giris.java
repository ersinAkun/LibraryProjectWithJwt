package practice_day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
/*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
 static Scanner scan= new Scanner(System.in);
    static List<OgretmenBilgi>ogretmenList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz okulumuza ");

        System.out.println("isim giriniz");

        String isim = scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Bransinizi giriniz");
        String brans = scan.next();

        scan.nextLine();  // dummy hayalet komut

        System.out.println("telefon no giriniz");
        String tel = scan.next();

        OgretmenBilgi adayOgretmen = new OgretmenBilgi(isim,soyisim,yas,brans,tel);


        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }
}
