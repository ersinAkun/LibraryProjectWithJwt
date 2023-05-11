package practice1;

import java.util.Scanner;

public class C01_PracticeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        int kilo = scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        int boy = scan.nextInt();

        int bmi = kilo/(boy*boy);



        switch (bmi) {
            case 1:
                if (bmi<=37/2) {
                    System.out.println("Zayifsiniz.");
                } break;
            case 2:
                if (37/2<bmi&& bmi<=25) {
                    System.out.println(" kilonuz idealdir");
                } break;
            case 3:
                if ((25<bmi) && (bmi<=30)) {
                    System.out.println("  şişmansınız");
                }break;
            case 4:
                if (bmi>=30) {
                    System.out.println("  obez ");
                }break;
            default:
                System.out.println("  hatalı bir tusa bastınız ");

             




        }
    }
}

