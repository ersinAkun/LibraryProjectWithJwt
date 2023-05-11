package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[] = {1,2,3,4,5,6,7};
        // array in tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar));

        // array in tum elementlerini yazdirin

        for (int i = 0; i < sayilar.length ; i++) {
            if (i!=sayilar.length-1){                         // i+" "     sondaki virgulu kaldirmak
                System.out.print(sayilar[i]+", ");                    //  icin for loop yaptik
            }else{
                System.out.print(sayilar[i]);
            }
        }



    }
}
