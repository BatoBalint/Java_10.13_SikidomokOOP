package hu.petrik;

import java.util.Random;

public class Kor extends Sikidom {
    private double r;

    public double getR() {
        return r;
    }

    public Kor() {
        this.r = veletlen();
    }

    public Kor(int r) {
        this.r = r;
    }


    @Override
    protected double keruletSzamit() {
        return 2 * r * Math.PI;
    }

    @Override
    protected double teruletSzamit() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Kor{ r = %f ; %s }", this.r, super.toString());
    }
}
