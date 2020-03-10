package pl.zzpj2020.solid.ocp.usa.solution;

public class Main {

    public static void main(String[] args) {
        USASpeedLimitFine regionSpeedLimit= new RegionSpeedLimitFine(100);
        System.out.println(regionSpeedLimit.calculateSpeedLimitFine(120));
    }



}
