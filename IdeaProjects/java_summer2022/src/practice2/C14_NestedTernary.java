package practice2;

public class C14_NestedTernary {
    public static void main(String[] args) {

               /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
        'A'  ->  "Gayet Basarili"
        'B'  ->  "Basarili"
        'C'  ->   "Ha gayret"
        Bu notlar disindakilere de Digerleri.. yazdiriniz
        */
        char finalNotu = 'C';

        String result = finalNotu=='A'? "gayet basarılı" : finalNotu=='B' ? "basarili" : finalNotu=='C' ? "ha gayret" :" Digerleri ..";
        System.out.println("result = " + result);



    }
}
