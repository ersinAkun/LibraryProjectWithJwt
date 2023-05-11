package day15_overLoadingForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //1 den 5 e kadar 5 dahil olan tamsayıları toplayalım

        int toplam =0;

        for (int i = 1;  i<=5 ; i++) {

            toplam+=i;
        }
        System.out.println("toplam :"+toplam);

        //10 dahil 20 dahil aradaki sayıları toplayın
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10 ile 20 arası toplam "+ toplam);

        //30 dahil 50 dahil aradaki cıft sayılar
        toplam = 0;
        for (int i = 30; i <= 50 ; i+=2) {
        toplam+=i;
        }
        System.out.println("30 ile 50 arası cıft sayılar toplamı "+toplam);

        // 2. yontem

        toplam = 0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }

        }
        System.out.println("30 ile 50 arası cıft sayılar toplamı "+toplam);

        // 1500 ile 1600 arası 7 ile bolunebilen sayıları toplayın
        toplam = 0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500 ile 1600 arası 7 ile bolunebilen sayıların toplamı "+toplam);





    }
}
