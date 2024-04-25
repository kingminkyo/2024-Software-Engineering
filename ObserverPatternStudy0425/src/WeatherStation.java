public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay1 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay2 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay3 = new CurrentConditionDisplay(weatherData);


        //currentConditionDisplay.display();

        weatherData.setMeasurements(50, 50, 50);
    }
}
