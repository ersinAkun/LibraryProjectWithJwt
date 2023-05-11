package practice5;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cm cinsinden istenen degeri giriniz  : ");
        double girilenCm = scan.nextDouble();

        metreyeCevir(girilenCm);
        kilometreyeCevir(girilenCm);
    }

    public static double kilometreyeCevir(double girilenCm) {
        double kilometre = girilenCm/100000;
        System.out.println(kilometre+" kilometre " );
        return kilometre;
    }

    public static double metreyeCevir(double girilenCm) {
        double metre = girilenCm/100;
        System.out.println(metre+" metre " );
        return metre;
    }
}
