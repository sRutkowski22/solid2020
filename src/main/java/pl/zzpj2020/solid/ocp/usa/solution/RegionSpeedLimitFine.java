package pl.zzpj2020.solid.ocp.usa.solution;

public class RegionSpeedLimitFine extends USASpeedLimitFine {


    public RegionSpeedLimitFine(int max_speed) {
        this.MAX_SPEED=max_speed;
    }

    @Override
    public double calculateSpeedLimitFine(int currentSpeed) {
        double fine = 0;
        fine = Math.abs((this.MAX_SPEED-currentSpeed)*5);//5$ for each kilometer over max_speed
        //calculate;
        return fine;

    }


}
