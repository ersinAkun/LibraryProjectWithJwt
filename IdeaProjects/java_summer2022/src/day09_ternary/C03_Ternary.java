package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi sıfır veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi = scan.nextDouble() ;

        if (sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("lütfen bir sayı daha giriniz");
            double sayi2 = scan.nextDouble() ;
            System.out.println(sayi*sayi2);
        }

                           /*eğer if else içerisinde yeni kodlar varsa
                           ternary ile apmamız mümkün olmaz
                            */





    }
}
