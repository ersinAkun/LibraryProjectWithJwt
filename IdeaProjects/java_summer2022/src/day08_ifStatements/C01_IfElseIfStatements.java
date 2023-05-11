package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

            //kullanıcıdan gün ismi yazmasını isteyin
            //girilen isim gecerli ise

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("paz");
        }else if (gun.equals("sali")) {
            System.out.println("sal");
        }else if (gun.equals("carsamba")) {
            System.out.println("car");
        } else if (gun.equals("persembe")) {
            System.out.println("per");
        }else if (gun.equals("cuma")) {
            System.out.println("cum");
        }else if (gun.equals("cumartesi")){
            System.out.println("cts");
        }


        }

    }




