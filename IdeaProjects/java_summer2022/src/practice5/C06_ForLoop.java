package practice5;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

    /*    Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen carpim tablosu icin bir deger giriniz : ");
        int deger = scan.nextInt();
        System.out.println("carpim tablosu " +deger);
        for (int i = 1; i <=10 ; i++) {
                System.out.println(deger+" * "+i+" = "+deger*i);
        }
        System.out.println("\n"+"\n");                */

        for (int i = 1; i <=10 ; i++) {    // outer for
            for (int j = 1; j <=10 ; j++) {  //  inner for
                System.out.println(i + " * " + j + " = "+ i*j);
            }  // inner sonu
            System.out.println(" ------- -- --------");
        }  // outer sonu

    }
}
