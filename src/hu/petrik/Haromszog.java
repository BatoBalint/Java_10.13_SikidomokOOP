package hu.petrik;

public class Haromszog extends Sikidom {
    private double a;
    private double b;
    private double c;

    public Haromszog() {
        boolean szerkesztheto = false;
        double a, b, c;
        while (!szerkesztheto) {
            this.a = veletlen();
            this.b = veletlen();
            this.c = veletlen();
            szerkesztheto = this.a >= this.b + this.c && this.b >= this.a + this.c && this.c >= this.a + this.b;
        }
    }

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
        double p = keruletSzamit() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return String.format("a = %f ; b = %f ; c = %f; $s", this.a, this.b, this.c, super.toString());
    }
}
