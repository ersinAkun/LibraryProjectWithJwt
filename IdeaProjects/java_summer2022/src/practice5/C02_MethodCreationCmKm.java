package practice5;

import java.util.Scanner;

public class C02_MethodCreationCmKm {
     /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.print("Donusturmek istediginiz cm degerini giriniz");
        double santiMeterValue = scan.nextDouble();

        convertCm(santiMeterValue);

     }

    public static void convertCm(double santiMeterValue) {
         double meter = santiMeterValue/100;
         double kiloMeter = santiMeterValue/100000;
        System.out.println("girdiginiz santimetre degeri: "+santiMeterValue+ " : "+meter+" metredir "+ kiloMeter+" km dir");
    }
}
