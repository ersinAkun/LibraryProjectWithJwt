package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Compile Time da bunu farkeder ve size izin vermez
         */
        str=null;

        //System.out.println(str.length());
        //NullPointerException
        Object obj = "Java java java";
        Integer sayi=(Integer)obj;  //ClassCastException
       /*
        String str2="Hava civa";
        Integer sayi=str2;
                            */
        /*
        Java bazi casting islemlerine Compile Time da izin vermez
        Ancak bazen syntex uygun olabilir
        bu durumda java kodun calismasina itiraz etmez
         */
        Thread.sleep(5000);
    }
}
