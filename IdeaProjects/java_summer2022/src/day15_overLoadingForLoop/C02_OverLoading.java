package day15_overLoadingForLoop;

public class C02_OverLoading {
    public static void main(String[] args) {

        /* javada olusturdugumuz methodların isminin yaptığı işlev ile uyumlu olmasını ısteriz
        mesela bir string in bir bolumunu almak icin java
        2 adet substring () method' lari veya
        verilen stringdeki bazı parcaları yenileri ile degıstırmek icin
        2 adet replace() method u var...

        java aynı isimde birden fazla method varsa hangisinin kullanılacagına
        parametre sayısı ve parametrelerrin data turune gore karar verir
         */

        String str = "Bu java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c','c');
        str.replace("J","H");
        //str.reolace(5,8);

        /* aynı ısımde ama farklı methodlar olusturmak icin
        degıstırebilecegımız seyler
        1- parametre sayısı
        2- aynı sayıda parametreye sahip olsa bile parametrelerin data turleri
        3- aynı sayıda ve aynı data turünde olan methodlarda
        parametrelerin sıralanısı

         */

    }
}
