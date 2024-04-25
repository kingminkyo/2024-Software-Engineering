public class ForecastDisplay implements Observer, DisplayElement{



    WeatherData weatherData;
    ForecastDisplay(WeatherData weatherData){
        weatherData.registObserver(this);
    }



    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
