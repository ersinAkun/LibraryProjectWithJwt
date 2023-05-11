package practice8;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
     /*   String[][] dovizler = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double dolarToplami = 0;
        double euroToplami = 0;

        for (String[] each1 : dovizler) {
            for (String each2 : each1) {
                if (each2.contains("$")) {
                    dolarToplami += Double.parseDouble(each2.replaceAll("\\D", "")) * 3.2;
                } else {
                    euroToplami += Double.parseDouble(each2.replaceAll("\\D", "")) * 3.2;

                }
            }
        }
        System.out.println("DOlar toplami = "+dolarToplami+"\nEuro toplami = "+euroToplami);
*/

        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*3.2;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("toplam "+ toplam);
    }

}

