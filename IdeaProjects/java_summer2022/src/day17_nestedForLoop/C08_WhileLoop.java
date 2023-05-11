package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /* kullanicidan toplamak uzere sayilar alin
           sayiların toplamı 500 u gecince sayıların toplamını ve kac sayi toplandıgını
           su sekilde yazdırın
           orn:
                13 sayı girdiniz ve toplamları 567
        */

        int toplam = 0;
        int sayi = 0;
        int sayac= 0;
        Scanner scan = new Scanner(System.in);


        while (toplam<500){
            System.out.println("Lutfen toplamak icin sayi girin");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac +"  sayi girdiniz ve toplamlari "+toplam);

    }
}
