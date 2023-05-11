package day12_stringManipulations;

public class C04_subString {
    public static void main(String[] args) {

        String str = "Java cok yasa";

        System.out.println(str.substring(3,4));  //a
        System.out.println(str.substring(5,7));   //co
        System.out.println(str.substring(6,6));   // ""   ilk 6 :6. dahil demek   ikinci 6 : 6 dahil değil demek yani hiçlik

        System.out.println("========");

       // System.out.println(str.substring(6,2));  //  exception    bu run time error dur

/*
           String s = "JAVA";
           s=s+"rocks";
           s=s.substring(4,8);
           s.toUpperCase();
        System.out.println(s);
*/




    }
}
