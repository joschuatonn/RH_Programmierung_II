package Aufgaben.Entwurfsmuster.observer.weatherstation.displays;

import Aufgaben.Entwurfsmuster.observer.weatherstation.Observer;
import Aufgaben.Entwurfsmuster.observer.weatherstation.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer {

    private WeatherData weatherData;
    private List<Double> pressureHistory;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.pressureHistory = new ArrayList<>();
        weatherData.registerObserver(this);
        update();
    }

    @Override
    public void update() {

        if(pressureHistory.size() >= 7) {
            pressureHistory.remove(0);
        }

        pressureHistory.add(weatherData.getPressure());

        String estimation = "schlecht";

        if(pressureHistory.get(0) < pressureHistory.get(pressureHistory.size()-1)) {
            estimation = "gut";
        }

        System.out.println("Basierend auf den Daten der letzten " + pressureHistory.size() + " Tage wird das Wetter: " + estimation);

    }
}
