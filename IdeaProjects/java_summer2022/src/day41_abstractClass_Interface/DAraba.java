package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
     /*    abstract class ta main method opsiyoneldir
           Eger abstract class sadece child class larin
           tasimak zorunda oldiugu ozzellikleri belirleme icin
           olusturulduysa main methoda ihtiyac olmaz
           saddece abstract method lar olur

            Ama bir abstract methodda standart belirlemek disinda da
            method lar calisdabilir
            bu durumda ihtiyac olursa main method olusturulabilir
        */


    }
    protected abstract void yakit();
    protected abstract void kaporta();


    protected abstract void motor();
    /*
    Sadece child class'larin mecburi tasiyacakllari ozellikleri
    belirleyen methodlar abstract method olur ve
    abstract methodlarin body'si olmaz
     */

    public void klima() {
        System.out.println("Bazi arabalarda klima olabilir");
        /*
          abstract olmayan method'lara concrete method denir
          abstract bir methodu abstract keyword ile belirtmek zorunludur
          concrete mehodlarda bunun deklare edilmesine gerek yoktur
          biz sadece abstraction ile ilgili konustugumuzda
          abstract olmayan methodlardan bahsetmek icin concrete tabirini kullaniriz
         */

    }


}










