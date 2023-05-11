package practice1;

import java.util.Scanner;

public class C02_JavaVeriable {
    public static void main(String[] args) {
//Bir degisken tanimlayin : x
//Baska bir degiskeni initialize edin : y
//x degiskenini initialize edin
//y degiskenini yeni bir değerle güncelleyin

        int x; //deklarasyon
        int y = 2000;  //initialize
        x = 30;   // x in initialize
        y = 1;   // güncelleme
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        System.out.println("\"Hello \", \"World \\ //\"");


        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");

        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        System.out.println("\"Zaruret\" insani \n\'kasif\' yapar \n\n\n\t\"TechProEd ile java cok kolay ...\"");


        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

                            //            bu double sayilarin ortalamasini bulunuz
        double toplam = num1 + num2 + num3 + num4 + num5;
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);

        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
        */
        int gallon = 1000;
        double litre = gallon*3.785;
        String sonuc1 = gallon + " galon değeri " + litre + " litreye eşittir";
        System.out.println(sonuc1);

        int l = 1000;
        double G = l/3.785;
        System.out.println(l + " litre değeri " + G + " Galona eşittir");
        // 1000 litre değeri 264.2007926023778 Galona eşittir

        Scanner scan = new Scanner(System.in);
        System.out.print("Fahrenayt değerini giriniz   : ");
        double fh = scan.nextDouble();
        // c = (f-32)*5/9
        System.out.println("Girdiğiniz faherenayt değeri  : " + ((fh-32)*5/9) + " santigrat derecedir");


        //kullanıcıdan 2 adet tam sayı alın
        //bu tam sayıları toplayın ve sonucu yazdırın
        Scanner scan1 = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz  : ");
        int sayi1 = scan1.nextInt();
        System.out.println("2. sayıyı giriniz  : ");
        int sayi2 = scan1.nextInt();

        System.out.println("iki sayının toplamı  : "+ (sayi1+sayi2));


       /* Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

        1 şeker = 1.7 gr

        Örnek Çıktı:

        Yılda 12.41 kg şeker kullanıyor.*/

        Scanner scan9 = new Scanner(System.in);
        System.out.println("günde kaç çay içiyorsunuz?");
        int cay = scan.nextInt();
        System.out.println("her çaya kaç şeker koyuyorsunuz?");
        double seker = scan9.nextDouble();


        System.out.println("Yılda "+(cay*365)*(seker*1.7)/(1000)+" kg şeker kullanıyor");












    }
}
