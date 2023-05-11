package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter girmesini isteyin
        //ve girdikten sonra harf olup olmadığını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf <= 'z' || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf");
        }
        else {
            System.out.println("girilen karekter bir harf değil");
        }


        }

}

