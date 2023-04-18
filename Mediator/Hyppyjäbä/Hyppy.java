package Mediator.Hyppyjäbä;

public class Hyppy {
    private double hyppy;
    private double pisteet;

    public double getHyppy() {
        return hyppy;
    }

    public void setHyppy(double hyppy) {
        this.hyppy = hyppy;
    }

    public double getPisteet() {
        return pisteet;
    }

    public void addPisteet(double pisteet) {
        this.pisteet += pisteet;
    }
}
