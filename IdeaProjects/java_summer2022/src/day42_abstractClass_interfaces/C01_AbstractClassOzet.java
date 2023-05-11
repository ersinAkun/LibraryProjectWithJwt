package day42_abstractClass_interfaces;

public class C01_AbstractClassOzet {
    /*
    1-    Bir class i abstract yapip yapmamaya bastan karar veririz
          eger bir class tan obje olusturmayacaksak, o class i
          child class larinin uymasi gereken kurallari belirleyecek sekilde
          dizayn etmek istiyorsak, abstract class yapariz

     2-   Abstract bir class da child class larinin mutlaka uymasi gereken kurallari abstract
          method lar ile belirleriz.Abstract methodlar
          mutlaka child class da override edilecegi icin body ye ihtiyac duymaz

     3-   Abstract olarak tanimlanan method larin body si olmaz

     4-   Abstract class zincirinden sonra gelen ilk concrate class,
          parent larinda bulunan ve concrate olmayan tum methodlari
          override etmek ZORUNDADIR ancak parent abstract class'larda bulunan
          concrate methotlari override etmek zorunda degildir

     5-   Abstract bir class'in abstract child'i parent daki abstract
          methodlari override etmek zorunda degildir.

     6-   abstract class'lar constructor a sahiptir, fakat
          abstract class'lardan OBJE OLUSTURULAMAZ


     */
}
