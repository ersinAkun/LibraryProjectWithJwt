package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini soyismini ve yaşını alıp girilen bilgiler = syfi capar 34 seklinde yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi  giriniz");
        String isim = scan.nextLine();                     //String verileri scanner ile alırken next ve nextline ile kullanılabilir
                                                            //next() ilk boşluğa kadar olan kısmı alır
                                                            //nextLine() satırın sonuna kadar ne yazarsak olur

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();
        System.out.println("girilen bilgiler  =  "+isim+ " "+ soyisim+" "+yas);
    }
}
