package Aufgaben.Entwurfsmuster.observer;

public class Test {
    public static void main(String[] args) {
        /*WeatherData weatherData = new WeatherData(20.0, 50.0, 100.0);

        new CurrentDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setTemp(34.23);*/

        WeatherData data = new WeatherData();
        StatisticsDisplay display = new StatisticsDisplay(data);
        //ForecastDisplay display1 = new ForecastDisplay(data);

        data.setHumidity(10);
        data.setHumidity(13);
        data.setHumidity(15);
        data.setHumidity(20);
        data.setHumidity(25);
        data.setHumidity(30);
        data.setHumidity(35);

        data.setHumidity(99);
        data.setPressure(10);
    }
}
