package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Güzeldir";
        int sayi1 = 5;
        int sayi2 = 4;
        //Java Güzeldir 54
        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2);     //Java Güzeldir 54

        System.out.println(str1 + " " + str2 + " " + (sayi1 + sayi2));    // Java Güzeldir 9

        System.out.println("" + sayi1 + sayi2 + " " + str2);           //54 Güzeldir

        System.out.println(str1.concat(str2));   //JavaGüzeldir
        System.out.println(str1.concat(" ").concat(str2));        //Java Güzeldir

        System.out.println(str2.concat(" ").concat(str1));
    }
}
