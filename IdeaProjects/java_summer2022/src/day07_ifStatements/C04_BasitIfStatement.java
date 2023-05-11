package day07_ifStatements;


import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gün HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
        ||girilenGun.equals("persembe")||girilenGun.equals("cuma")){
            System.out.println("Girilen gün haftaiçi");
        }


    }

}
