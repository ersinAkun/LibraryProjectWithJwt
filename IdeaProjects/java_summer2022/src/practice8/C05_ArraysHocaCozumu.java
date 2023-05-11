package practice8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C05_ArraysHocaCozumu {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> dataBaseIsimler = new ArrayList<>();
        dataBaseIsimler.add("Enes");
        dataBaseIsimler.add("Ismail");
        dataBaseIsimler.add("Abdulbaki");
        dataBaseIsimler.add("Emre");
        dataBaseIsimler.add("Melisa");
        dataBaseIsimler.add("Oguz");
        System.out.println("dataBaseIsimler : "+dataBaseIsimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username'i giriniz");
        String username =scan.nextLine().trim();

        boolean usernameVarMi = dataBaseIsimler.contains(username);
        if (usernameVarMi){
            System.out.println("Bu kullanici adi onceden alinmis");
        }else {
            System.out.println("bu kullanici adini kullanabilirsiniz");
        }
        if (usernameVarMi){
            int randomSayi = new Random().nextInt(100);
            username+=randomSayi;
            System.out.println("yeni kullanici adiniz : "+ username);
        }else{
            System.out.println("yeni kullanici adiniz : "+username);
        }






    }
}
