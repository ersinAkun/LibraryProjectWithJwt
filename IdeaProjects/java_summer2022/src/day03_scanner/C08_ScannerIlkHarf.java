package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);// java da java scanner class ında next char metodu yoktur
                                                          // bunun yerine string olarak ilk kelimeyi alıp ınunda ilk harfin alabiliriz
        System.out.println("ismin ilk harfi  =  "+ilkHarf);

    }
}
