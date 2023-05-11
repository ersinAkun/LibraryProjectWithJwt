package practice_day09_practice.restorant;

public class Mutfak {

    public String yemekler="adanakebap, urfaciger, kusbasi, kusleme";
    public String araSicak="yaylacorba, mercimek, duguncorba, corba";
    public String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler="ayran, salgam, kola";


    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebap;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;

    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\naraSicak='" + araSicak + '\'' +
                ",\ntatlilar='" + tatlilar + '\'' +
                ",\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
