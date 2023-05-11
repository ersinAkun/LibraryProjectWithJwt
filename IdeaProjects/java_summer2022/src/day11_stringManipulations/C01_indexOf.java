package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";
        // verilen bir string de herhangi bir string veya char ın
        // ilk kullanıldığı index i bize döndürür

        System.out.println(str.indexOf('g'));  // 6
        System.out.println(str.indexOf("r"));  // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); //  mek   i blok olarak düşünür ve ilk index in değerini verir =10

       //eğer istediğimiz indexten sonrasını kontrol etmek istersek
       //o zaman ayni methodu iki parametreli olarak kullanabiliriz


        System.out.println(str.indexOf("g",(6+1))); // yazilan index ten baslar     18

        // yukaıdaki str da 2. ve 3. e nin indexlerini bulun
        // 2. e yi bulabilmek için 1. e nin index ine ihtiyacım var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e",ilke+1);

        //eger 2. e varsa 3. e nin olup olmadığını
        //ve varsa indexini yazdıralım

        if (ikincie==-1){
            System.out.println(" verilen str da ikinci e yok");
        }else {
            int ucuncue =str.indexOf("e",ikincie+1);
            if (ucuncue ==-1){
                System.out.println("verilen str da 3. e yok");
            }else{
                System.out.println("verilen str daki 3. e nin index i : "+ ucuncue);
            }
        }






    }
}
