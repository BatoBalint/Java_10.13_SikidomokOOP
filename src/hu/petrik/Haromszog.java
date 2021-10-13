package hu.petrik;

public class Haromszog extends Sikidom {
    private double a;
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    protected double keruletSzamit() {
        return a + b + c;
    }

    @Override
    protected double teruletSzamit() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("a = %f ; b = %f ; c = %f");
    }
}
