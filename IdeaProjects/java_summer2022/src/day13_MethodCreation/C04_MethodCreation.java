package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen iki integeri toplayıp sonucunu yazdıran method olusturun

        int input1 = 10;
        int input2 = 20;


        //method 4 adımda olusturulur
        // 1. adım method call
        // 2. adım argument eklenmesi gerekiyorsa ekleyelim
        // eger methodun return typ ı voıd den farklı olacaksa
        // bir variable olusturup method  call u assıng edelim

        topla(input1,input2);


    }

    public static void topla(int input1, int input2) {
        //method deklarasyonunda degıstırılmesi gereken
        // bolumlerı degıstır (access modifier, return type vb...
        //4. eger return type voıd dısında bir seyse
        //return  keywor u ve donecek degeri hesaplamalıyız
        System.out.println("Girilen iki sayının toplamı :"+(input1+input2));
    }


}
