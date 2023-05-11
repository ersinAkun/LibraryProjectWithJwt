package dev_projectRequirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrunSec {
    public static int urunNo;
    public static double miktar;

    public static double urunMiktari;
    public static Scanner scan = new Scanner(System.in);
    public static boolean cikis = false;
    public static List<String> sepet = new ArrayList<>();
    public static double toplamFiyat;
    public static int odeme = 1;
    public static int devam=2;

    public static void urunSec() {

        do {

            System.out.println("Almak istediginiz urunun no'sunu giriniz ");
            urunNo = scan.nextInt();
            for (int i = 0; i < ManavGiris.urunList.size(); i++) {
                if (urunNo == ManavGiris.sira().indexOf(i)) {
                    System.out.println(ManavGiris.urunList.get(i));
                    sepet.add(ManavGiris.urunList.get(i));
                    System.out.println("Almak istediginiz miktari kg cinsinden giriniz");
                    miktar = scan.nextDouble();
                    if (miktar > 10) {
                        System.out.println("Stokculukla mucadele kapsaminda 10 kg uzeri urun satisi yasaklanmistir...");
                        break;
                    } else {
                        System.out.println(ManavGiris.urunList.get(i) + " urununden " + miktar + " kg sepete eklendi");
                        System.out.println(ManavGiris.fiyatList.get(i) * miktar + " tl urunun toplam fiyati");

                        toplamFiyat += ((ManavGiris.fiyatList.get(i) * miktar));
                        System.out.println("sepetteki urunlerin fiyat toplami : " + toplamFiyat);

                        if (toplamFiyat > 1000) {
                            System.out.println("***UYARI***\n Sepet toplam fiyati : " + toplamFiyat + " Tl olmustur");
                            System.out.println("Odemeye gecmek icin 1 tusuna,\nalisverise devam etmek icin 2 tusuna basiniz");
                            odeme=scan.nextInt();
                            if (odeme==1){
                                cikis=true;
                            }else{
                                System.out.println("Almak istediginiz urunun no'sunu giriniz ");
                                cikis=false;
                            }
                        }
                    }
                }
            }
            //System.out.println("Almak istediginiz urunun no'sunu giriniz ");
        } while (!cikis);


    }

}
