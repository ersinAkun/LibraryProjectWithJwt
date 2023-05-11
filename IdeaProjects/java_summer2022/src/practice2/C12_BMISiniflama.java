package practice2;

import java.util.Scanner;

public class C12_BMISiniflama {
    public static void main(String[] args) {

                   /*
            *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
            *
            MI = kilo(kg) /(boy*boy)(cm)
            MI <=20 oldukca zayifsiniz
            0<BMI<=25 Normal sinirlardasiniz
            5<BMI<=30 Sisman kategorisindesiniz
            0<BMI ==> Obez grubundasiniz.            */

        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz : ");
        double boy = scan.nextDouble()/100;  //cm yi metreye cevirdik bundan sonra mt olarak atanmıs oldu***

        System.out.println("kilonuzu kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        double bmi = kilo/(boy*boy);

        if (bmi<=20 ){
            System.out.println("bmi index iniz "+bmi + "oldukca zayıfsınız ");
        }else if (bmi<=25){
            System.out.println("bmi index iniz "+ bmi+ " normal sınırlardasınız ");
        }else if (bmi<=30){
            System.out.println("bmi index iniz "+bmi +" sisman kategorisindesiniz ");
        }else if (bmi>=30){
            System.out.println("bmi index inix "+ bmi + " obez grubundasınız ");
        }

        // ternary ile
        //String sonuc= vke<=20 ? "Oldukça Zayıfsınız" : vke<=25 ? "Normal Sınırlardasınız" :
        //                vke<=30 ? "Şişmansınız": "Obezsiniz";




    }
}
