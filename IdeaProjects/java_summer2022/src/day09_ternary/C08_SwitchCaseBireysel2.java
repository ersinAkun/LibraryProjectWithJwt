package day09_ternary;

public class C08_SwitchCaseBireysel2 {
    public static void main(String[] args) {

        String input = "d" ;
        switch (input.toUpperCase()) {
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("lütfen geçerli bir giriş yapınız");


        }


    }
}
