package dev_projectRequirements;

public class ManavRunner {

    public static void main(String[] args) {
        System.out.println(" Manava hosgeldiniz \n Urun listemizden alacaginiz urunu secebilirsiniz!!\n");

        ManavGiris.List();
        ScannerSecim.secim();
        UrunSec.urunSec();
        Odeme.odeme();
        System.out.println("Bizi Tercih Ettiginiz Icin Tesekkur Ederiz");

    }
}
