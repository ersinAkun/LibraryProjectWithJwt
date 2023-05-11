package practice9;

import java.util.ArrayList;
import java.util.List;

public class C07_SpecialCharRemoveArrayList {
    public static void main(String[] args) {
         /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.
   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı
   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

        List<String> list = new ArrayList<>();
        list.add("$13");
        list.add("$15");
        list.add("$20");
        System.out.println(getSum(list));

    }
    public static int getSum(List<String> list) {
        int toplam = 0;
        for (String each : list) {
            int prize = Integer.valueOf(each.replace("$",""));
        toplam+=prize;
        }


        return  toplam;
    }
}
