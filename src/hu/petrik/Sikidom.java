package hu.petrik;

public abstract class Sikidom {

    protected abstract double keruletSzamit();
    protected abstract double teruletSzamit();

    @Override
    public String toString() {
        return String.format("K = %f; T = %f", keruletSzamit(), teruletSzamit());
    }
}
