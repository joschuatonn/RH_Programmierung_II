package Aufgaben.Entwurfsmuster.observer.weatherstation;

import Aufgaben.Entwurfsmuster.observer.weatherstation.displays.HeatIndexDisplay;
import Aufgaben.Entwurfsmuster.observer.weatherstation.displays.StatisticsDisplay;

public class Test {
    public static void main(String[] args) {
        /*WeatherData weatherData = new WeatherData(20.0, 50.0, 100.0);

        new CurrentDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setTemp(34.23);*/

        WeatherData data = new WeatherData();
        //StatisticsDisplay display = new StatisticsDisplay(data);
        //ForecastDisplay display1 = new ForecastDisplay(data);
        HeatIndexDisplay display2 = new HeatIndexDisplay(data);

        data.setTemp(28.3);
        data.setHumidity(42.3);
    }
}
