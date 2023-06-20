package Uzduotis1;

public class Apskritimas {
    double spindulys;

    public Apskritimas() {
    }

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;


    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }
    public double diametras () {
        return 2*spindulys;
    }
}
