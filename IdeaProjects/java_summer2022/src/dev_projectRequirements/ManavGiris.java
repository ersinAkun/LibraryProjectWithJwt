package dev_projectRequirements;

import java.util.ArrayList;
import java.util.List;

public class ManavGiris {

    public static String[] urunler = {"Domates", "Patates", "Biber", "Sogan",
            "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"};

    public static Double[] fiyat = {20.10, 30.20, 30.50, 20.30, 30.10,
            50.20, 100.90, 60.10, 40.30, 20.70, 10.50,};



    public static List<String> urunList = new ArrayList<>(List.of(urunler));
    public static List<Double> fiyatList = new ArrayList<>(List.of(fiyat));

    public static void List() {
        System.out.println("No          Urun          Fiyat");
        System.out.println("=================================");

        for (int i = 0; i < fiyatList.size(); i++) {

            System.out.printf("%02d        %-8s        %05.2fTL \n", (i ), urunList.get(i), fiyatList.get(i));
        }
    }
    public static List<Integer> sira(){
        List<Integer>sirali = new ArrayList<>();
        for (int i = 0; i < urunler.length; i++) {
            sirali.add(i);

        }
        return sirali;
    }
}
