package day15_overLoadingForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen iki sayıyı çarpıp
        // sonucu bize donduren bir methot yapalım
        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1, sayi2);
        System.out.println("illa da sonucu göreyim diyenlere "+sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {

        int sonuc = sayi1*sayi2;
        System.out.println("illa da sonucu göreyim diyenlere "+sonuc);
        return sonuc;
    }
}
