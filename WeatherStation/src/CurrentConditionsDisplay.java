import javax.security.auth.Subject;
import java.util.Observer;
import java.util.Observable;

/**
 * Created by Nehrist on 15.09.2014.
 */
public class CurrentConditionsDisplay implements Observer, IDisplayElementable {
   Observable observable;
    private float temperature;
    private float humidity;
    private ISubjectable weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
