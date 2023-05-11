package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {


        int sayi = 23;
        //curly braces kullanılmazsa java ilk satırı şart ile bağlar
        //sonraki satır bağımsız olur

        if(sayi>0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktır");
            System.out.println("ücüncü satır");
        }
        if (sayi%2==0){
            System.out.println("sayi çift");
            System.out.println("çift kalacaktır");
        }
        if (sayi%5==0){
            System.out.println("sayi 5 in tam katı");

        }
    }
}
