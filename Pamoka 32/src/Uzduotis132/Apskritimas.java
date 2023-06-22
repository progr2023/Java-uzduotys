package Uzduotis132;

public class Apskritimas {
    private double spindulys;

    public Apskritimas() {
    }

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
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
    public void padidinaSpinduli (int n) {
        spindulys *= n;
    }

}
