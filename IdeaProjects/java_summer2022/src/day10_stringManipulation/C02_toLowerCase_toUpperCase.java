package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata baglamayın";

        System.out.println(str.toUpperCase());  //BENİ PSİKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        // Eğer büyük küçük harf dönüşümünde local bir dili esas almak isterseniz bu method kullanılabilir.

    }
}
