package day05_matematikselIslemler;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1; //11

        // pre veya post increment sadece ++ veya -- işlemi için geçerlidir.

        int sayi3 = sayi2++;  //1- sayi2 bir artılacak                sayi3 = 11
                              //2- sayi2 değeri sayi3 e atanacak      sayi2 = 12

        int sayi4 = ++sayi1;    //1- sayi1 bir artılacak              sayi4 = 11
                                //2- sayi1 değeri sayi4 e atanacak    sayi1 = 11


    }
}
