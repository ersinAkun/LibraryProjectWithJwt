package day11_stringManipulations;

import jdk.swing.interop.SwingInterOpUtils;

public class C07_startsWith {
    public static void main(String[] args) {

        String input = "Java gun gectikce guzellesıyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));  //5. index ve sonrası gün ile mi başlıyor


    }
}
