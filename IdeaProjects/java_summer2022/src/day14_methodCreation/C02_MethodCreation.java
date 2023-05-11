package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verilen 3 bassamaklı bir sayının
        // rakamları toplamını yazdıran bir method oluşturalım


        int input = 423;
        rakamlariTopla(input);

    C01_MethodCreation.terstenYazdir("kara");

    C04_MethodCreation.topla(9,9);

    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami=0;
        int temp = input;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi = input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdiğiniz "+ temp + " sayısının rakamlar toplami "+ rakamlarToplami);




    }
}
