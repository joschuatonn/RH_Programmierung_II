package Aufgaben.Entwurfsmuster.observer;
import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject{
    private List<Observer> observerList;

    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData(double temp, double humidity, double pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observerList = new ArrayList<>();
        notifyObservers();
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList) {
            observer.update();
        }
    }
}
