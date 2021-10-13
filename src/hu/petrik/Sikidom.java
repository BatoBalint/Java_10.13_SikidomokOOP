package hu.petrik;

import java.util.Random;

public abstract class Sikidom {

    protected abstract double keruletSzamit();
    protected abstract double teruletSzamit();
    protected final static Random rnd = new Random();

    @Override
    public String toString() {
        return String.format("K = %f; T = %f", keruletSzamit(), teruletSzamit());
    }
}
