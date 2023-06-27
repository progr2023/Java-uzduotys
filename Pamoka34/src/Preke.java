public class Preke {
    private int id;
    private double kaina;
    private int kiekisSandelyje;
    private String kategorija;

    public Preke() {
    }

    public Preke(int id, double kaina, int kiekisSandelyje, String kategorija) {
        this.id = id;
        this.kaina = kaina;
        this.kiekisSandelyje = kiekisSandelyje;
        this.kategorija = kategorija;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKiekisSandelyje() {
        return kiekisSandelyje;
    }

    public void setKiekisSandelyje(int kiekisSandelyje) {
        this.kiekisSandelyje = kiekisSandelyje;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "id=" + id +
                ", kaina=" + kaina +
                ", kiekisSandelyje=" + kiekisSandelyje +
                ", kategorija='" + kategorija + '\'' +
                '}';
    }

}
