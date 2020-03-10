package pl.zzpj2020.solid.dip.weathertracker.solution;

public class main {

    public static void main(String[] args) {
        Device phone = new Phone();
        Device emailer = new Emailer();
        WeatherTracker weatherTracker = new WeatherTracker(phone);
        weatherTracker.setCurrentConditions("sunny");
        WeatherTracker weatherTracker1 = new WeatherTracker(emailer);
        System.out.println("\n");
        weatherTracker1.setCurrentConditions("rainy");


    }
}
