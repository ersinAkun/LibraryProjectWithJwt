package practice7;

import java.util.Scanner;

public class C01__WhileLoop {
    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

  /*      Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz :");
        int sayi= scan.nextInt();
        int toplam=0;
        int i =1;
        while(i<=sayi){
                toplam+=sayi%10;
                sayi=sayi/10;
            i--;
        }
        System.out.println("rakamlar tooplami : "+toplam);
                                                                       */

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));

    }

    public static int basamakToplama(int sayi) {
        int toplam=0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        return toplam;
    }
}
