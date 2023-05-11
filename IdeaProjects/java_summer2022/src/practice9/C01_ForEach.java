package practice9;

public class C01_ForEach {
    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
       /* System.out.print("Cift olanlar : ");
        for (int each : arr) {
            if (each%2==0 ){
                System.out.print(each+" ");
            }
        }
        System.out.print("\nTek olanlar  : ");
        for (int each2 : arr) {
            if (each2%2==1){
                System.out.print(each2+" ");
            }
        }*/
        System.out.print("Cift olanlar:");
        for (int each:arr) {
             if (each%2==0){
                 System.out.print(each+" ");
             }

        }
        System.out.print("\nTek olanlar:");
        for (int each:arr) {
            if (each%2==1){
                System.out.print(each+" ");
            }

        }




    }
}
