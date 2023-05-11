package practice3;

public class C01_SwitchCase1 {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
     /*   String input = "carsamba";

        switch (input) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi günleri  ..");
                break;
            case "carsamba":
                System.out.println(" SQL dersi gunleri  ..");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri   ..");
                break;
            case "cumartesi":
                System.out.println(" SQL dersi gunleri   ..");
            case "pazar":
                System.out.println(" izin gunu   ..");
                break;
            default:
                System.out.println("lütfen geçerli bir gün giriniz");

        }    */

        String gun = "Carsamba";

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("sql dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("selenyum derleri");
                break;

            default:
                System.out.println("izin gunu");


        }


    }
}
