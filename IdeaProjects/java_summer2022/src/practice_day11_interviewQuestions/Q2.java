package practice_day11_interviewQuestions;

import java.util.Scanner;

public class Q2 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
     *  alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String input = scan.nextLine();
        System.out.println("ilk ve son harf kac kez yazilsin? bir sayi giriniz..");
        int sayi = scan.nextInt();

        System.out.println("ilk ve son index yaziyor " + kackez(input, sayi));


    }

    public static String kackez(String input, int sayi) {
       String str = (input.substring(0,1))+(input.substring(input.length()-1));
       String output="";
        for (int i = 0; i <sayi ; i++) {
            output+=str;
        }
        return output;
    }

}
/*
Scanner scan = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String input = scan.nextLine();
        System.out.println("ilk ve son harf kac kez yazilsin? bir sayi giriniz..");
        int sayi = scan.nextInt();


        String [] arr = input.split("");
        for (int i = 0; i <sayi ; i++) {
            System.out.print(arr[0]+""+arr[arr.length-1]);
        }

 */