package practice4;

import java.util.Scanner;

public class Q06_StringManipulastion {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
     /*   System.out.println("lutfen string degerini giriniz :");
        String input = scan.nextLine();

        if (input.contains(" ")) {
            System.out.println("stringde bosluk karakteri var  : " + "true");
        } else if (input.contains("")) {
            System.out.println("stringin ici  bos  : " + "true");

        } else {
            System.out.println("false");
        }              */
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');
        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }

    }
}
