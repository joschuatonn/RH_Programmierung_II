package Aufgaben.Entwurfsmuster.observer.weatherstation.displays;

import Aufgaben.Entwurfsmuster.observer.weatherstation.Observer;
import Aufgaben.Entwurfsmuster.observer.weatherstation.WeatherData;

public class CurrentDisplay implements Observer {
    private WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        update();
    }

    @Override
    public void update() {
        System.out.println("Current conditions: " + weatherData.getTemp()
                + "°C and " + weatherData.getHumidity()
                + "% humidity and " + weatherData.getPressure() + " Mb is the pressure");
    }
}
