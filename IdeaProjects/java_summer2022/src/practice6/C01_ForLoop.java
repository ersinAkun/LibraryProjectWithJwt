package practice6;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

         /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz ");
    /*    char harf = scan.next().charAt(0);
        int i = 0;
        char chr = ' ';
        while (harf >= 'a' && harf <= 'z') {
            if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
                System.out.println(harf + " harfi sesli harftir");
                break;
            } else if (harf != 'a' || harf != 'e' || harf != 'i' || harf != 'o' || harf != 'u') {
                System.out.println(harf + " harfi sessiz harftir");
                break;

            } else {
                    System.out.println("Yanlis karakter girdiniz! ");
                    break;
                }

            }                                     */
        String harf = scan.next().toLowerCase();

        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnpqrstvxwyz";

        if (harf.length()==1){
            for (int i = 0; i <sesliHarfler.length() ; i++) {
                if (sesliHarfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("yanlis karakter girdiniz");
                    break;
                }
            }
        }else {
            System.out.println("birden fazla karakter girdiniz, lutfen bir karakter giriniz");
        }













        }

    }

