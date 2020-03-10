package pl.zzpj2020.solid.ocp.usa.solution;

public abstract class USASpeedLimitFine {

    protected int MAX_SPEED;


    protected USASpeedLimitFine() {
    }

    public abstract double calculateSpeedLimitFine(int currentSpeed);
}
