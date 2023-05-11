package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*while loop ta once kontrol edip sonra işlem yaptıgımız icin
        islem bittikten sonra loop un kırılması ıcın bir kez daha basa donmemiz gerekiyor
        bu durumda fazladan bir islem yapılıyor
         */

        int sayi = 7;
        while (sayi<10){
            System.out.println(sayi);

            sayi++;
        }
        System.out.println("");
                  /*
                  do while loop ile calistigimizda bu dezavantaj ortadan kalkar
                   */
        sayi =7;
        do {
            System.out.println(sayi);
            sayi++;
        }while(sayi<10);




    }
}
