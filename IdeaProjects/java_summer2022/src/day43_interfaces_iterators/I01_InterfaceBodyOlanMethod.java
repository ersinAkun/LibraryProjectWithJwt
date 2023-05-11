package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunsek
    iki tane access modifier kullanma ihtimali OLAMAZ

    asagidaki method da goreceginiz gibi
    interface de istisnai olarak body si olan methodlar olusturulabilir
    Bu ozellik Java 8 den sonra kullanilmaya baslamistir
    bu ozellikten once, bir interface e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface i implement eden tum classlara gidip
    yeni eklenen methodu override etmemiz gerekirdi

    Bu ozellik sayesinde baasina default veya static keyword ekleyerek
    interface de yeni ve body si olan bir method olusturursak
    bu method'un child class lar tarafindan override edilme MECBURIYETI OLMAZ
    ve eskiden implement etmis class lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    Bu methodlarin body si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    Buradaki default kelimesi access modifier degil istisnai durumun belirtilmesi icindir\

    o zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci child class lardan bu methoda nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa childclass lardan bu methoda erismek icin
    InterfaceAdi.methodAdi  yeterli olur

    default keyword kullanilirsa, methoda erismek icin obje olusturulmalidir

     */

    public default void teker(){
        System.out.println("default...Tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("static ...Tum arabalarin direksiyonu vardir");
    }


}
