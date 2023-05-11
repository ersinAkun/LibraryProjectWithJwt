package day40_final;

final public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.isim = "Alp";

        obj.isim = "dayi";
        System.out.println(isim);  // A daki isim degisti

        obj.finalMethod();

        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */
    }
}