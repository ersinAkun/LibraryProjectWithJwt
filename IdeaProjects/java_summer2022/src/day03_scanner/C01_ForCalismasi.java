package day03_scanner;

import java.util.Scanner;

public class C01_ForCalismasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir tane Tam Sayı Girin :");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " Sayısı Çift Sayıdır");

        } else {
            System.out.println(sayi + " Sayısı Tek Sayıdır");
        }
    }}
