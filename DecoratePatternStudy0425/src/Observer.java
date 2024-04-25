public interface Observer {
    public void update(float temp, float humidity, float pressure);

}

class CurrentConditionDisplay implements Observer, DisplayElement{

    float temp;
    float humidity;
    WeatherData weatherData;
    CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }
    @Override
    public void display() {
        System.out.println("현재 상태: 온도" + temp + "F, 습도 " + humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }



}