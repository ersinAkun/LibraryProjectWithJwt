package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi = scan.nextDouble() ;

        //eğer ternary içindeki sonuçlar farklı data türlerindeyse atama yapamayız sadece yaazdırabiliriz
        //=>   double sonuc = sayi>0 ? "Sayi Pozitif " : (sayi*sayi);
        System.out.println(sayi>0 ? "sayi pozitif  " : (sayi*sayi));


    }

}
