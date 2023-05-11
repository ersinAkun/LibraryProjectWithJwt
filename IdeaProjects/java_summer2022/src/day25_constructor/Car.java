package day25_constructor;

public class Car {

    /*
    bu class bizim kaliphanemiz
    Bir araba olusturmak icin ihtiyacimiz olan variable ve mmethodlari bu
    class tan belirleriz
    sonra farkli class larda araba olusturmamiz gerekirse bu classtan bir obje olusturup burada belirlenen
    variable ve methodlara gore araba uretiriz
     */

    public  String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil ;
    public int fiyat ;


    public void benzinliArac (){
        System.out.println("Bu araac benzinli motora sahiptir");
    }
    public void maxHiz (int hiz){
        System.out.println("Bu araba max "+hiz + " km hiz yapar");

    }
}
