package practice5;
public class C01_MethodCreaation {
    public static void main(String[] args) {

         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        birKereYazdir("abbba aacccddde eehh");


    }

    private static void birKereYazdir(String str) {
        String output = "";   //string defauld degeri "" hiclik oldugu icin isleme etki etmesin diye bu sekilde atadik
        for (int i = 0; i <str.length() ; i++) {
            if (!output.contains(str.substring(i,i+1))){     // tekrarsiz karakterleri dondurecegimiz icin sonucumuz strden
                 output+=str.substring(i,i+1);                 // aldigimiz herhengi bir karakteri icermesin
            }
        }
        System.out.println(output);
    }
}
