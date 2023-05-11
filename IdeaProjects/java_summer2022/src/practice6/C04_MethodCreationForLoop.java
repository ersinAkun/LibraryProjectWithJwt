package practice6;

public class C04_MethodCreationForLoop {
    static String str = "Java is very good";


    public static void main(String[] args) {

        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

        tersYazdir();


    }

    public static void tersYazdir() {

        String reverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        System.out.print("tersten yazim : " + reverseString);
    }


}


