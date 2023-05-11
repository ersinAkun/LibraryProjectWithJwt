package day09_ternary;


public class C06_SwitchCase {
    public static void main(String[] args) {

        //kullanıcıdan gün ismi alınız   //  Long Double Float Boolean kullanilmaz

        String input = "pazar";

        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lütfen geçerli bir gün giriniz");


        }

        switch (input) {
            case "pazartesi":
                System.out.println("haftaici");
                break;
            case "sali":
                System.out.println("haftaici");
                break;
            case "carsamba":
                System.out.println("haftaici");
                break;
            case "persembe":
                System.out.println("haftaici");
                break;
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
                System.out.println("haftasonu");
                break;
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lütfen geçerli bir gün giriniz");
        }

        String input2 = "aralik";
        input2 = input2.toLowerCase();

        switch (input2){
            case "ocak":
                System.out.println("ocak");
                break;
            case "subat":
                System.out.println("subat");
                break;
            case "mart":
                System.out.println("mart");
                break;
            case "nisan":
                System.out.println("nisan");
                break;
            case "mayıs":
                System.out.println("mayıs");
                break;
            case "haziran":
                System.out.println("haziran");
                break;
            case "temmuz":
                System.out.println("temmuz");
                break;
            case "agustos":
                System.out.println("agustos");
                break;
            case "eylul":
                System.out.println("eylul");
                break;
            case "ekim":
                System.out.println("ekim");
                break;
            case "kasım":
                System.out.println("kasım");
                break;
            case "aralik":
                System.out.println("aralik");
                break;

        }

    }
}