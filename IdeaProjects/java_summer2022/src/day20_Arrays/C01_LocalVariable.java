package day20_Arrays;

public class C01_LocalVariable {

    public static void main(String[] args) {

        int sayi=10;
       // System.out.println(sayiMethod);  sayiMethod method 1 de olusturulmus local variable dir

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
     //   System.out.println(i);   ///    i loop ta  olusturulmus local variable dir   sadece loop icerisinde kullanilir
     //  static int sayiStatic=20;  static keyword sadece classs level da kullanilabilir
      // methodlarin icerisinde static variable TANIMLANAMAZ

    }

    public static void method1(){
      //  System.out.println(sayi);
        /* sayi main methodda olusturulmus local bir variable dir
        sadece main methodda gecerlidir
         */
        int sayiMethod=20;
    }

}

