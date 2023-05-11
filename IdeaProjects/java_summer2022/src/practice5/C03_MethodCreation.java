package practice5;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

                  /*
            Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
               0-1-1-2-3-5-8-13-21-34....
            */
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 47 den kucuk bir N sayisini giriniz : ");
        int n = scan.nextInt();

        System.out.print(sayi1 + " " + sayi2);

        for (int i = 2; i < n; i++) {
            sayi3 = sayi1 + sayi2;
            System.out.print(" " + sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
        }
        System.out.println("  ");

    }
}

