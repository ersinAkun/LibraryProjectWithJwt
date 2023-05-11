package practice5;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("for dongusu ile cozum...");
        for (int i = 0; i <=255 ; i++) {
            char c = (char) i;   // casting yaptik, sayi harf ve karakter
            System.out.println(i +" --> "+c);
        }
        System.out.println("\nwhile dongusu ile cozum...");
        int i=0;
        while(i<=255){
            char c = (char)i;
            i++;
            System.out.println(i +" --> "+c);
        }
        System.out.println("\ndo-while dongusu ile cozum");

        int a=0;
        do {
            char karakter = (char) a;
            System.out.println(a +" --> "+karakter);
            a++;
        }while(a<=255);
    }
}
