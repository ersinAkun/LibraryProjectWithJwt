package practice7;

public class C09_Arrays {
    public static void main(String[] args) {
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int[][] arr1 = { {0,2,-1}, {3,8,9}, {7} };
        int[][] arr2 = { {-7,6,-9}, {0,12}, {19} };
        int toplam1=0;
        int toplam2=0;
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                toplam1+=arr1[i][j];
            }
        }
        System.out.println("arr1 in elemanari toplami : "+toplam1);

        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                toplam2+=arr2[i][j];
            }
        }
        System.out.println("arr2 nin elemanlari toplami : "+toplam2);
        System.out.println("iki array'in tum elemanlarinin toplami: "+(toplam1+toplam2));
    }
}
