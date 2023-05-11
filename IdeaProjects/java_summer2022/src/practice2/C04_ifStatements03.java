package practice2;

import java.util.Scanner;

public class C04_ifStatements03 {
    public static void main(String[] args) {
        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
        System.out.print("lutfen is unvanınızı giriniz : ");
        Scanner scan = new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();

       if (jobTitle.equals("qa")) {
           System.out.println("quality analyst");
       } else if (jobTitle.equals("dev")) {
           System.out.println("developer");
       } else if (jobTitle.equals("ba")) {
           System.out.println("Business Analyst");
       } else if (jobTitle.equals("pm")) {
           System.out.println("Project Manager");
       } else {
           System.out.println("lütfen gecerli bir is unvanı giriniz");
       }


        switch (jobTitle) {
            case "qa":
                System.out.println("quality analyst");
                break;
            case "dev":
                System.out.println("developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlıs formatta jobtitle bilgisi girdiniz");
                break;
        }


    }
}
