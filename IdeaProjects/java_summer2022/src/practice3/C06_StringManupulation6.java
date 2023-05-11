package practice3;

import java.util.Scanner;

public class C06_StringManupulation6 {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

     /*   Scanner scan = new Scanner(System.in);
        System.out.print(" 1. veriyi giriniz : ");
        String veri1 = scan.nextLine();

        System.out.print("2. veriyi giriniz : ");
        String veri2 = scan.nextLine();

        System.out.println("veri1 + veri2 = "+(veri1+veri2));

        veri1 = veri1.substring(1);
        veri2 = veri2.substring(1);
        System.out.println("veri1 + veri2 yeni degeri : " + (veri1+veri2));         */


        Scanner scan = new Scanner(System.in);
        System.out.println("1. degeri giriniz : ");
        String str1 = scan.nextLine();

        System.out.println("2. degeri giriniz :");
        String str2 = scan.nextLine();

        System.out.println("1. yontem : " +str1+" "+str2 );
        System.out.println("2. yontem : " +str1.concat(" "+str2));

        String str1_0indextenSonrasi = str1.substring(1);
        String str2_0indextenSonrasi = str2.substring(1);

        System.out.println("manupulation dan sonraki hali "+str1_0indextenSonrasi+" "+str2_0indextenSonrasi);



    }
}
