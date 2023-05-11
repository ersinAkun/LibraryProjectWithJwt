package practice7;

public class C07_Arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;
        arrMethod(arr,istenenToplam);


        /*   int temp =0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]+arr[i+1]==istenenToplam){
                System.out.println(arr[i]+" "+arr[i+1]);
                temp+=arr[i]+arr[i+1];
            }
        }
        System.out.println("istenen index toplami :  "+temp);     */


    }

    public static void arrMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1 ; j <arr.length ; j++) {   //j=i+1 yerine i ya da 0 da yazabilirdik en mantiklisi i+1
                if (arr[i] + arr[j]==9){
                    System.out.println(arr[i]+" ve "+arr[j]+" toplam : "+istenenToplam);
                }
            }
        }

    }
}
