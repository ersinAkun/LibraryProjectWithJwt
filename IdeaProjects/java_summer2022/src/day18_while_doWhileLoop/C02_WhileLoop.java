package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        /* kullanıcıdan bir sayi alın  ve sayinin rakamlari toplamını yazdırın   */

        int input = 54321;

        int rakamlarToplami =0;
        int birlerBasamagi =0;
        int temp = input ;

        while (temp>0) {

            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;

        }

        System.out.println(input+ " input sayisinin rakamlar toplami "+rakamlarToplami);
    }
}
