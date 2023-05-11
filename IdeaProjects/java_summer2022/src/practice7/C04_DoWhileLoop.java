package practice7;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

         /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String input= scan.nextLine();
        int i=0;
        char abc=' ';
        do { i++;
            if (input.length()>=3 && input.length()%2==1){

                abc=input.charAt(input.length()/2);
                System.out.println("OUTPUT:"+abc);
                break;

            }else {
                System.out.println("OUTPUT: "+"You entered wrong word.");
                break;
            }

        }while(i<=input.length());



    }
}
