package practice3;

public class C07_StringManupulation7 {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

   /*     String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D","");
        System.out.println(str1);

        str2 = str2.replaceAll("\\D","");
        System.out.println(str2);

        double val1 = Double.parseDouble(str1);
        double val2 = Double.parseDouble(str2);

        // prints the double value
        System.out.println("Value1 = " + val1);
        System.out.println("Value2 = " + val2);

        val1 = val1/100;
        val2 = val2/100;
        System.out.println(val1);
        System.out.println(val2);

        System.out.println("toplamücret  : $"+(val1+val2));     */

        String str1= "$13.99";
        str1 = str1.replaceAll("\\D","");
        System.out.println("str1 : "+str1);

        String str2= "$10.55";
        str2 = str2.replaceAll("\\D","");
        System.out.println("str1 : "+str2);

        System.out.println(str1+str2);  // 13991055

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam = (sayi1+sayi2)/100;

        System.out.println("$"+toplam);    //$ 24.54

















    }
}
