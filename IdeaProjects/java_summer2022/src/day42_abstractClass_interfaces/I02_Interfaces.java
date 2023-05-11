package day42_abstractClass_interfaces;

public interface I02_Interfaces {

    int SAYI=30;
    String ISIM = "Yildiz Koleji";

    /*
       Interface bir class degildir

       Abstract class lar Java da abstraction (soyutlastirma / kural koyma)
       islevini yapiyordu
       Ancak abstract bir class ta abstract olmayan methodlar da olabilir
       bu da full abstraction yapmaya izin vermez

       Eger Java da icinde hic concrade method olmasin dedigimiz
       bir class  istiyorsaniz bunu clas degil
       Interface yapmalisiniz

       1- INTERFACE' LERDE CONCRADE METHOD OLMAZ

       2- Interface ler full abstraction yaptigindan
          Interface lerden obje olusturulamaz

        Hatirladiginiz gibi List'ten direkt obje olusturamiyorduk
        List<String> liste = new List<>();
        Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
        List<String> liste = new ArrayList<>();

       3- Class'larda bir child birden fazla parent edinemez
         Ancak interface lerde concrete method olmadigindan
         biz her methodu child class da override etmek zorundayiz
         Override ederken kimin soyledigini override ettigimizin onemi yok

       4- Interface 'ler neyinyapilmasi gerektigini soyler
         ama nasil yapilacagina karismaz

     */


}
