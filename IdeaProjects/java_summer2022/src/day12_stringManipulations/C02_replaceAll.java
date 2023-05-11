package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        //str ı Bugun Java cok guzel haline getirin
        //replaceAll () methodundaki all un amacı aynı özellikteki tüm karakterleri kapsamasıdır
        //butun sayıları si
        //butun ozel karakterleri sil
        //TÜM ÖZEL KARAKTERLERİ SİLELİM DEDİĞİMİZ DE SPACE LERDE SİLİNİYOR
        //space leri korumak için en basta onların yerine cumlede bulunmayacak bir string koyalım
        //"qazwsx"
        str=str.replace(" ", "qazwsx");
        System.out.println(str);

        str = str.replaceAll("\\W","");
        System.out.println(str);

       str= str.replaceAll("\\d", "");
        //istenmeyen özel karakter ve sayılardan kurtulduk
        // şimdi space leri geri getirelim
       str= str.replace("qazwsx"," ");
        System.out.println(str);


    }
}
