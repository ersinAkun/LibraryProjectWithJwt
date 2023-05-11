package practice4;

import java.util.Scanner;

public class Q04_StringManipulastion {
    public static void main(String[] args) {

        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan= new Scanner(System.in);
        System.out.println("kelimeyi giriniz : ");
        String word = scan.next();

        if (word.length()%2==1 && word.length()>=3){
            System.out.println("ortanca karakter : "+word.substring(word.length()/2,(word.length()/2+1)));
        }else{
            System.out.println("word çift sayıda karakter icerir");
        }





    }
}
