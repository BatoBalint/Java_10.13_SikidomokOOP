package hu.petrik;

import java.nio.channels.OverlappingFileLockException;

public class Paralelogramma extends Sikidom {
    private double a;
    private double b;
    private double alpha;

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public Paralelogramma() {
        this.a = veletlen();
        this.b = veletlen();
        this.alpha = Math.random() * 180;
    }

    public Paralelogramma(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }


    @Override
    protected double keruletSzamit() {
        return 2 * (a + b);
    }

    @Override
    protected double teruletSzamit() {
        return a * b * Math.sin(alpha);
    }
}
