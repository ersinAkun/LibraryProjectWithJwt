package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>=b);  //true

        System.out.println(a<0 && b<20 && c>=b);  //false


        System.out.println(a<0 & b<20 && c>=b);   //false

        //java and operatörü konusunda bize iki seçenek sunar;
        //&& kullanırsak ilk false bulduğunda artık sonucun false olacağını bilir
        // ve geriye kalan sartları incelemez
        // & kullanırsak tüm şartları kontrol eder sonra sonucu belirler
        //bu çalışma usulunden dolayı & operatörü && operatörüne göre daha yavaş olabilir

        System.out.println(a<0 & b<20 & c>=b);//false

    }
}
