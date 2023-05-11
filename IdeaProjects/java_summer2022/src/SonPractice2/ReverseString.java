package SonPractice2;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Dunyasi cok guzel";// 0(n) --> 0(n/2)
        System.out.println(reverse(str));

    }

    public static String reverse(String name) {
        String str2 = "";
        // 1. yol
//        String[] str1 = name.split("");
//        StringBuilder sb = new StringBuilder(name);
//        sb.reverse(); // bu da olur
//        String strTers = "";
//        for (int i = str1.length - 1; i >= 0; i--) {
//            strTers += str1[i];
//        }
//        return strTers;
        // 2. yol
        String temp = "";
        String[] str = name.split("");
        for (int i = 0; i < str.length; i++) {
            String start = str[i];
            String end = str[str.length - 1 - i];
            //   if (start == end) {break;}            bu satırla hata veriyor
            //    temp = start;
            start = end;
            //  end = temp;
            str2 = str2 + start;


        }
        return str2;
    }

}
