package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi syisminizi yaşınızı giriniz  \naralarda enter tuşuna basınız");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("girilen bilgiler   ="+ isim +" " + soyisim +" "+ yas);*/

        Scanner scan = new Scanner(System.in);
        int kisaK = scan.nextInt();

        int uzunK = scan.nextInt();

        System.out.println("Alan:"+(kisaK*uzunK));
        System.out.println("Çevre:"+(2*kisaK+2*uzunK));



    }
}
