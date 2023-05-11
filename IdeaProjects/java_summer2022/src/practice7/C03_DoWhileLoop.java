package practice7;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

           /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

   /*     Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir deger giriniz : ");
        String input = scan.nextLine();
        int i = 0;
        char x = 'x';
        do {
            i++;
            if (input.toLowerCase().charAt(i) == x) {
                System.out.println("Program bitti.");
                break;

            } else {
                System.out.println("Program calisiyor.");
            }break;
        } while (i <= input.length());                           */

        Scanner scan = new Scanner(System.in);
        String okunan = "";
        do {
            System.out.println("Harf giriniz : ");
            okunan = scan.next();
            System.out.println("Program calisiyor");


        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("program bitti");
    }
}









