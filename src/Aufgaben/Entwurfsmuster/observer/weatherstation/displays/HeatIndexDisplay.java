package Aufgaben.Entwurfsmuster.observer.weatherstation.displays;

import Aufgaben.Entwurfsmuster.observer.weatherstation.Observer;
import Aufgaben.Entwurfsmuster.observer.weatherstation.WeatherData;

public class HeatIndexDisplay implements Observer {

    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Heat-Index: " + computeHeatIndex(weatherData.getTemp(), weatherData.getHumidity()));
    }

    private double computeHeatIndex(double t, double rh) {
        // N.B.: the following values are applicable for temperatures in °C.
        // For °F please use values from the table in
        // the referenced wiki article.
        // Also, the formula is only applicable for temperatures >= 26.7°C and humidities >= 40%.
        // for reference: https://de.wikipedia.org/wiki/Hitzeindex or https://en.wikipedia.org/wiki/Heat_index

        double c1, c2, c3, c4, c5, c6, c7, c8, c9, index;
        c1 = -8.784695;
        c2 = 1.61139411;
        c3 = 2.338549;
        c4 = -0.14611605;
        c5 = -0.012308094;
        c6 = -0.016425828;
        c7 = 0.002211732;
        c8 = 0.00072546;
        c9 = -0.000003582;
        index = c1 + c2 * t + c3 * rh + c4 * t * rh + c5 * t * t + c6 * rh * rh + c7 * t * t * rh + c8 * t * rh * rh + c9 * t * t * rh * rh;
        return index;
    }
}
