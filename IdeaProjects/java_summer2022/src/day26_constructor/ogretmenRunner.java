package day26_constructor;

public class ogretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Ogretmen1 "+ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Geometri");
        System.out.println("Ogretmen2 "+ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("Ogretmen 3 "+ogretmen3);
    }
}