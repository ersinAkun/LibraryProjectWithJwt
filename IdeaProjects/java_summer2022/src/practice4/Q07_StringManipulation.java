package practice4;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime giriniz :");
        String word = scan.next();
        if (word.length()!=4){
            System.out.println("Girdiginiz veri 4 harfli degil!");
        }else {

            System.out.println(word.substring(word.length() - 1) +
                    word.substring(word.length() - 2, word.length() - 1) +
                    word.substring(word.length() - 3, word.length() - 2) +
                    word.substring(word.length() - 4, word.length() - 3));
        }





    }
}
