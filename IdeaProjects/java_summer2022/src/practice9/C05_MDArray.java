package practice9;

import java.util.Arrays;

public class C05_MDArray {
    public static void main(String[] args) {

          /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        System.out.println("Eleman sayisi (arr) : "+kacEleman(arr));
    }
    public static int kacEleman(int[][] arr) {

        System.out.println(Arrays.deepToString(arr));
        int toplam =0;
        for (int[] each1 : arr) {
            for (int each2 : each1) {
                toplam++;
            }
        }
        return toplam;
    }
}
