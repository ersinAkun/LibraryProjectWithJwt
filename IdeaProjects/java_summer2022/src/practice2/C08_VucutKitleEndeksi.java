package practice2;

import java.util.Scanner;

public class C08_VucutKitleEndeksi {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("vucut agırlıgınızı kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        System.out.print("cm olarak boy uzunlugunuzu giriniz : ");
        double boy = scan.nextDouble();
        boy /= 100;

        double bki = kilo/(boy*boy);

        System.out.println("vucut kitle endeksiniz : "+ (bki));



    }
}
