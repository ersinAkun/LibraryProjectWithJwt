package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // bana integer donduruyor  -1

        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index'idir
        // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
        // Java -1 dondurmeyi tercih etmistir

        String str5 = "wertyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";
        // str5'de p harfi var midir ?
                       //p
        if (str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else{
            System.out.println("str5'de istenen karakter kullanilmis");
        }

        String str9 = "Deliye Hergun Bayram";
        System.out.println(str9.length());  // 20
        System.out.println(str9.indexOf('a'));  //15
        System.out.println(str9.toLowerCase().indexOf("b"));  //14
         if (str9.indexOf("ş")==-1){
             System.out.println(" lütfen başka bir harfi deneyin");
         }else {
             System.out.println("ş harfi vardır");
         }


    }
}
