package day25_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        C01 obj1 = new C01();

        System.out.println(obj1.sayi); // 0 (default deger)
        obj1.deneme();  //  C01'den deneme method calisir

        C01 obj2 = new C01();
        System.out.println(obj2.sayi);
        obj2.deneme();

    }
}
