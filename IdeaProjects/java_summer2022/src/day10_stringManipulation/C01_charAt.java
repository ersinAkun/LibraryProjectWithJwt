package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {


        String str = "java ogrenmek ne guzel";

        System.out.println(str.charAt(0));   //ilk harfi yazdırır

        System.out.println(str.toUpperCase().charAt(7));  //7. indexteki karakteri büyük harf olarak yazdırır (R)

        System.out.println(str.charAt(21));   // l
          // System.out.println(str.charAt(22));
            // son harfi bulmak için str nin uzunluğunun 1 eksiğini index olarak gireriz
            //eğer index olarak uzunluğu veya daha büyük bir sayı girersek java exception verir

        //char At metodu kullandığımızda sonuc char olacağı için artk manupulasyon yapamayız
        //String metotlarından kullanmamız gerreken bir method varsa char at  ten önce kullanmalıyız



    }
}
