package SonPractice1;

import java.util.Arrays;

public class C1_SubArray {
    public static void main(String[] args) {
        /*
Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz
Örnek :
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
 */
    int[] num = {-4,-1,0,3,10};

    int[] num2 = Arrays.stream(num).map(t->t*t).sorted().toArray();
        System.out.println(Arrays.toString((num2)));
    //    System.out.println(Arrays.toString(sortedArray(num)));

    }
   /* public static int[] sortedArray(int [] num){
        int i=0;
        for ( ; i <num.length ; i++) {
            num[i]*=num[i];
        }
        Arrays.sort(num);
        return num;
    }   */


}
