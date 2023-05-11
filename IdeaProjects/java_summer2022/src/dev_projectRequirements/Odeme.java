package dev_projectRequirements;

import java.util.Scanner;

public class Odeme {
    public static boolean kartSecimi = false;
    public static boolean kartBilgileri = false;
    public static String kartNo;
    public static String kartS;
    public static int odemeSec;
    public static String onayKodu;
    public static Scanner scan = new Scanner(System.in);

    public static void odeme() {
        System.out.println("ODEME SECENEKLERI : \n1-Kredi Karti\n2-Banka Karti");
        do {
            odemeSec = scan.nextInt();
            if (odemeSec == 1 || odemeSec == 2) {
                System.out.println("odeme icin banka ile baglanti gerceklestiriliyor...");
                kartSecimi = true;
            } else {
                System.out.println("Lutfen odeme secenegi icin dogru giris yapiniz!!!");
                kartSecimi = false;
            }
        } while (!kartSecimi);
        do {
            System.out.println("Kart uzerindeki 16 haneli kart numarasini giriniz");
            kartNo = scan.next();
            if (kartNo.length() == 16 && kartNo != "\\D") {
                System.out.println("Kart numarasi alindi\nKart sahibinin adini ve soyadini giriniz");
                kartBilgileri = true;
            } else {
                System.out.println("Kart no yu hatali girdiniz");
                kartBilgileri = false;
            }
            kartS = scan.nextLine();
            scan.next();
            System.out.println("Degerli musterimiz, odemeyi tamamlamak icin telefonunuza gelen,\n5 haneli onay kodunu giriniz");
            onayKodu = scan.nextLine().replaceAll(" ", "");
            scan.next();
            if (onayKodu.length() < 5 && onayKodu.length() > 5) {
                System.out.println("Onay kodu yanlis girildi");
                kartBilgileri = false;
            } else {
                System.out.println("Odeme isleminiz onaylanmistir\n");
                kartBilgileri = true;
            }
        } while (!kartBilgileri);
    }
}

