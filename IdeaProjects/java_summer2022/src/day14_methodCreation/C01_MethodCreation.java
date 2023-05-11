package day14_methodCreation;

import day01_variables.C01_HelloWorld;
import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 4 harfli bir stringi
        // tersten yazdıran bir method yazdıralım

       terstenYazdir("okan");



    }

    public static void terstenYazdir(String input){
        String tersInput = input.substring(3)+
                           input.substring(2,3)+
                           input.substring(1,2)+
                           input.substring(0,1);
        System.out.println("veerilen kelimenin tersten yazılışı : " + tersInput);

    }
}
