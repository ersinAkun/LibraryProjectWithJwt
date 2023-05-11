package practice_day10_practice.okul_proje;

public class OgretmenBilgi {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgi() {
    }

    public OgretmenBilgi(String isim, String soyisim, int yas,
                         String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgi"+
                "\nisim : " + isim +
                "\nsoyisim : " + soyisim +
                "\nyas : " + yas +
                "\nbrans : " + brans +
                "\ntel : " + tel ;

    }
}
