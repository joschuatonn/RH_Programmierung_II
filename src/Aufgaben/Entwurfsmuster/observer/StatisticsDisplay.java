package Aufgaben.Entwurfsmuster.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer{
    private List<DataModel> dataList;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.dataList = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        if(dataList.size() >= 7) {
            dataList.remove(0);
        }

        DataModel dm = new DataModel(weatherData.getTemp(), weatherData.getHumidity(), weatherData.getPressure());

        dataList.add(dm);

        double avgTemp = dataList.stream().mapToDouble(DataModel::getTemp).average().getAsDouble();
        double avgHumidity = dataList.stream().mapToDouble(DataModel::getHumidity).average().getAsDouble();
        double avgPressure = dataList.stream().mapToDouble(DataModel::getPressure).average().getAsDouble();

        double maxTemp = dataList.stream().mapToDouble(DataModel::getTemp).max().getAsDouble();
        double minTemp = dataList.stream().mapToDouble(DataModel::getTemp).min().getAsDouble();

        double maxHumidity = dataList.stream().mapToDouble(DataModel::getHumidity).max().getAsDouble();
        double minHumidity = dataList.stream().mapToDouble(DataModel::getHumidity).min().getAsDouble();

        double maxPressure = dataList.stream().mapToDouble(DataModel::getPressure).max().getAsDouble();
        double minPressure = dataList.stream().mapToDouble(DataModel::getPressure).min().getAsDouble();

        System.out.println("x----------------------------------------------------x");
        System.out.println("Statistiken der letzten " + dataList.size() + " Tage:");
        System.out.println("- Durchschnittliche Temperatur: " + avgTemp + "°C "+ "(Max: " + maxTemp + "°C, Min: " + minTemp + "°C)");
        System.out.println("- Durchschnittliche Luftfeuchtigkeit: " + avgHumidity + "% "+ "(Max: " + maxHumidity + "%, Min: " + minHumidity + "%)");
        System.out.println("- Durchschnittlicher Luftdruck: " + avgPressure + "mB "+ "(Max: " + maxPressure + "mB, Min: " + minPressure + "mB)");
        System.out.println("x----------------------------------------------------x");

    }
}
