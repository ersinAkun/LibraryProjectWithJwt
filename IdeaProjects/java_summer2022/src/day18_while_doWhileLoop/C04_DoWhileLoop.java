package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan tamsyilar alin
        // kulanici cift sayi girdigi muddetce sayilari yazdirin
        // tek sayi girdiginde islemi bitirin


        Scanner scan = new Scanner(System.in);
        int sayi =0;

        // while icin
        /* loop larda kullanacagimiz variable lari loop tan once olusturmalıyız
        while loop ta loop tan önce olusturdugumuz bu variable a atayacagimiz degeri iyi dusunmemiz gerekiyor
         */
        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift : "+ sayi);
            }else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }
        }
            //  do while loop
        //   do while loop ta önceden lusturulan variable a hangi deger atandiginin
        // hicbir onemi yok kodumuz her durumda calisir
        /* do while ın dezavantajı :
          ilk calistirma kontrol yapılmadan old icin
          loop un body sinde yanlis bir islem yapılmamasına dikkat etmek gerekir
         */
        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift : "+ sayi);
            }else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }


        }while(sayi%2==0);


    }
}
