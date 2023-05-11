package day24_arrayListForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06ForeachLoop {
    public static void main(String[] args) {

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        //array deki tum elemanlari inceleyelim tek sayi olanlari List e atayalim

        for (int each: arr    //gelecek datalarin turu(int), loop icinde ne isim verdigim(each), ve nereden aldigim(arr)
             ) {

            if (each%2==1){
                liste.add(each);
            }
        }

        System.out.println(liste);


    }


}
