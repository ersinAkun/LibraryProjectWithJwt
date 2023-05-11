package practice_day13_interviewQuestions;

import java.util.Arrays;

public class Q5 {
      /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/

    public static void main(String[] args) {

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        System.out.println(Arrays.deepToString(arr)+"******");

        System.out.println("elemanSayisi(arr) = " + elemanSayisi(arr));

    }

    private static int elemanSayisi(int[][] arr) {
        int sayac = 0;
        for (int i = 0; i <arr.length ; i++) {    //outer loop
            for (int j = 0; j <arr[i].length ; j++) {  // inner loop icin
                sayac++;
            }
        }
        return sayac;

        /*for (int[] each:arr) {
            for (int i:each) {
                sayac++;   */
    }
}


