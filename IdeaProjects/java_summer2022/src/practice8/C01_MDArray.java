package practice8;

public class C01_MDArray {
    public static void main(String[] args) {

        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int minNumber = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (minNumber > arr[i][j]) {
                    minNumber = arr[i][j];
                }
            }
        }
        System.out.println("arr nin min numberi = " + minNumber);
        System.out.println("");

        int minNumber2 = arr[0][0];
        for (int[] each1 : arr
        ) {
            for (int each2 : each1
            ) {
                if (each2 < minNumber2){
                    minNumber2 = each2;
                }
            }
        }
        System.out.println("arr nin each le cozulen  min numberi = " + minNumber);
    }
}


