package practice7;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

/*        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz :");
        int sayi= scan.nextInt();
        int i = 0;
        while(i<=sayi){
            if (i%2==1){
                System.out.println(i);
            }
            i++;
        }                                                    */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int count = 0;
        while(sayi>0) {
            if (sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }
        System.out.println("count : "+count);

    }
}
