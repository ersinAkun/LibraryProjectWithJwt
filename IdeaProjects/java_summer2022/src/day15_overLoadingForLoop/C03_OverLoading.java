package day15_overLoadingForLoop;

public class C03_OverLoading {
    public static void main(String[] args) {

        topla(5,7);  // 12
        topla(5.2,3); //8.2
        topla(3.4,6.1);  //9.5


    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integerin tooplamı :" + (sayi1+sayi2));
    }
/*
    bir class ta parametre sayısı ve parametre data turleri aynı olan iki method olusturamayız!!
    public static void topla(int sayi3, int sayi4){
        System.out.println("iki integerin tooplamı :" + (sayi3+sayi4));
    }
*/

    public static void topla(double sayi1, int sayi2){
        System.out.println("Bir double ve bir integerin tooplamı :" + (sayi1+sayi2));
    }


    public static void topla(int sayi1, double sayi2){
        System.out.println("Bir integer ve bir double ın tooplamı :" + (sayi1+sayi2));
    }

    public static void topla(double sayi1, double sayi2){
        System.out.println("iki double ın  tooplamı :" + (sayi1+sayi2));
    }

}
