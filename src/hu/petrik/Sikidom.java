package hu.petrik;

import java.util.Random;

public abstract class Sikidom {

    protected abstract double keruletSzamit();
    protected abstract double teruletSzamit();
    private final static Random RANDOM = new Random();
    protected final double veletlen() {
        return RANDOM.nextDouble() * 10 + 1;
    }

    @Override
    public String toString() {
        return String.format("K = %f; T = %f", keruletSzamit(), teruletSzamit());
    }
}
