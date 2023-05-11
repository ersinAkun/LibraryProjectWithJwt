package practice3;

import java.util.Scanner;

public class C05_StringManupulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    /*    Scanner scan = new Scanner(System.in);
        System.out.print(" isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.print(" soyisminizi giriniz : ");
        String soyisim = scan.nextLine();

        String isimUc = isim.substring(0,3).toUpperCase();
        String isimSon = isim.substring(3);

        System.out.println("isminiz : " + isimUc+isimSon+ " ");             */



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz :");
        String firstName = scan.nextLine(),
                lastName = scan.nextLine();   // multiple declaration

        String fullName = firstName.concat(" " +lastName).toUpperCase();
        System.out.println("fullName = " + fullName);




    }
}
