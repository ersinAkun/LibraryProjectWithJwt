package day12_stringManipulations;

public class
C03_subString {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyIsım = "Karanfil";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(3));     //  eyman
        System.out.println(soyIsım.substring(soyIsım.length()-3));  //  fil

        System.out.println(isim.substring(2,4));  // le

        //isim ve soyismin ilk harfi büyük geriye kalan yıldız
        // kredi kartının ilk 4 rakamı görünsün geriye kalan *

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan = isim.substring(1).replaceAll("\\w", "*");

        String soyisimlkHarf = soyIsım.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar = soyIsım.substring(1).replaceAll("\\w","*");

        String kkIlk4 = kartNo.substring(0,4);
        String kkGeriyeKalanlar = "**** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "+ soyisimlkHarf + soyisimGeriyeKalanlar
                + "\n "+ kkIlk4+kkGeriyeKalanlar );





    }
}
