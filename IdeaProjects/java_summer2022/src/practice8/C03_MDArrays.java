package practice8;

public class C03_MDArrays {
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int[][] sayilar = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        System.out.println("ciftleriTopla(sayilar) = " + ciftleriTopla(sayilar));

    }
    public static int ciftleriTopla(int[][] sayilar) {
        int cifToplami = 0;
        for (int[] each1 : sayilar) {
            for (int each2 : each1) {
                if (each2 % 2 == 0) {
                    cifToplami += each2;
                }
            }
        }
        return cifToplami;
    }
}

