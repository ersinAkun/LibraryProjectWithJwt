package practice4;

import java.util.Scanner;

public class Q05_StringManipulastion {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz :");
        String name = scan.nextLine();


        System.out.println("Lutfen soyadınızı giriniz :");
        String surName = scan.nextLine();

        if (name.length()>surName.length()) {
            System.out.println("name surname den uzun");

        } else if (name.length()==surName.length()) {
            System.out.println("name ile surname esit uzunlukta");
        }else{
            System.out.println("surname name den uzun");
        }



    }
}
