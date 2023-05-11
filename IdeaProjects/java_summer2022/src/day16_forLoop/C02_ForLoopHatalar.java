package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //baslangıctan noktasından sonra
        // bitis sinirına yaklasmıyorsak sonsuz loop olusur

       /*
        for (int i = 0; i >-10 ; i++) {
            System.out.print(i);
        }
*/
        // eger ılk deger icin bile bitis sartı saglanmıyorsa
        //for loop calısır
        // ama loop body si hicbir zaman devreye girmez(calısmaz)

        for (int i = 0; i >5 ; i++) {
            System.out.println(i);
        }



    }
}
