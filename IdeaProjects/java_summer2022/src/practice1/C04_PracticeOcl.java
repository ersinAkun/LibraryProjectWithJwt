package practice1;

public class C04_PracticeOcl {
    public static void main(String[] args) {



        String str = "to";
        int check =4;
        if (check == str.length()){
            System.out.println(str.charAt(check -=1 ) +",");
        }else {
            System.out.println(str.charAt(0)+ ",");

        }

    }
}
