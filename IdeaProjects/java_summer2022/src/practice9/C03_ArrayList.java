package practice9;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

     /*   int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scan = new Scanner(System.in);
        System.out.println("en buyuk olan kac sayi yazilsin?");
        int sayi = scan.nextInt();

        if (sayi == 2) {
            System.out.println((input.length - 1) + " and " + (input.length));
        }
   */
        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 102, 47, 0};
        int n = 4;
        // bir liste olusturalim
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 1;
        while (count <= 4) {
            int max = list.get(0);  // list in ilk elemani max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max && !maxList.contains(list.get(i))) {
                    max = list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max));
            count++;
        }
        System.out.println("Array'in max : "+n+" elemani "+maxList);

    }
}

