package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = " Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

           // hava kelimesini java yapalım
        System.out.println(str.replace("h","J").replace(" ", ""));

        //gü zel yerine harika yapalım

        System.out.println(str.replace("guz el","harika"));

        //cümleyi replace kullanarak Bugun Java cok guzel yapalım

        str= str.replace("Bu gun", "Bugun")
                .replace("ha va", "Java")
                .replace("guz el", "guzel");
        System.out.println(str);




    }
}
