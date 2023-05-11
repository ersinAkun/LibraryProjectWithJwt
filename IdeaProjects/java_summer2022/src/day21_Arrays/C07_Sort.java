package day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int[] sayilar = {5,7,1,6,4,7,9};       // array sirali degil

        //Array i Arrays class'ini kullanarak natural sirali hale getirebiliriz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));  //  [1, 4, 5, 6, 7, 7, 9]

    }
}
