package practice3;

import java.util.Scanner;

public class C03_SwitchCase3 {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.


       // Scanner scan = new Scanner(System.in);

     /*   System.out.print("3 Basamaklı bir sayi giriniz : ");
        int sayi = scan.nextInt();


        int birler = sayi % 10;

        int yuzler = sayi/100;

        int onlar = ((sayi)%100)/10;

        switch(yuzler) {
            case 1:
                System.out.print("yüz ");
                break;
            case 2:
                System.out.print("iki yüz ");
                break;
            case 3:
                System.out.print("üç yüz ");
                break;
            case 4:
                System.out.print("dort yüz ");
                break;
            case 5:
                System.out.print("besyuz ");
                break;
            case 6:
                System.out.print("Altı yüz ");
                break;
            case 7:
                System.out.print("Yedi yüz ");
                break;
            case 8:
                System.out.println("sekiz yüz ");
                break;
            case 9:
                System.out.println("dokuz yüz ");
                break;
        }
        switch (onlar){
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kırk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmıs ");
                break;
            case 7:
                System.out.print("Yetmis ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;

        }
        switch(birler) {
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki");
                break;
            case 3:
                System.out.print(" üç");
                break;
            case 4:
                System.out.print(" dört");
                break;
            case 5:
                System.out.print(" beş");
                break;
            case 6:
                System.out.print(" altı");
                break;
            case 7:
                System.out.print(" yedi");
                break;
            case 8:
                System.out.print(" sekiz");
                break;
            case 9:
                System.out.print(" dokuz");
                break;
        }   */


        Scanner scan=new Scanner(System.in);
        System.out.println("3 haneli sayiyi giriniz");
        int sayi= scan.nextInt();

        int birlerBas=sayi%10, onlarBas=(sayi/10)%10, yuzlerBas=sayi/100;

        if (sayi>99 && sayi<1000){

        switch (yuzlerBas){
            case 0: System.out.print("");break;
            case 1: System.out.print("yuz\t");break;
            case 2: System.out.print("ikiyuz\t");break;
            case 3: System.out.print("ucyuz\t");break;
            case 4: System.out.print("dortyuz\t");break;
            case 5: System.out.print("besyuz\t");break;
            case 6: System.out.print("altiyuz\t");break;
            case 7: System.out.print("yediyuz\t");break;
            case 8: System.out.print("sekizyuz\t");break;
            case 9: System.out.print("dokuzyuz\t");break;
            }

            switch (onlarBas){
                case 0: System.out.print("");break;
                case 1: System.out.print("on\t");break;
                case 2: System.out.print("yirmi\t");break;
                case 3: System.out.print("otuz\t");break;
                case 4: System.out.print("kırk\t");break;
                case 5: System.out.print("elli\t");break;
                case 6: System.out.print("altmıs\t");break;
                case 7: System.out.print("yetmis\t");break;
                case 8: System.out.print("seksen\t");break;
                case 9: System.out.print("doksan\t");break;
                }
                switch (birlerBas){
                    case 0: System.out.print("");break;
                    case 1: System.out.print("bir\t");break;
                    case 2: System.out.print("iki\t");break;
                    case 3: System.out.print("uc\t");break;
                    case 4: System.out.print("dort\t");break;
                    case 5: System.out.print("bes\t");break;
                    case 6: System.out.print("alti\t");break;
                    case 7: System.out.print("yedi\t");break;
                    case 8: System.out.print("sekiz\t");break;
                    case 9: System.out.print("dokuz\t");break;
            }
            }else
                System.out.println("uc haneli bir sayi giriniz ...");






        }


    }


