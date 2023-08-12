package tec.bd.weather;
import java.util.HashMap;
import java.util.Map;
import static java.util.Optional.*;

public class WeatherServiceImpl implements WeatherService {

    private Map<String, Float> cityTemperatureData;
    private Map<String, Float> zipCodeTemperatureData;

    public WeatherServiceImpl(){

        this.cityTemperatureData = new HashMap<>(){
            { put("Alajuela", 23.0f ); }
            { put("San José", 24.0f ); }
            { put("Heredia", 25.0f ); }
            { put("Cartago", 26.0f ); }
            { put("Limón", 27.0f ); }
            { put("Puntarenas", 28.0f ); }
            { put("Guanacaste", 29.0f ); }
        };

        this.zipCodeTemperatureData = new HashMap<>(){
            { put("20101", 23.0f ); }
            { put("10101", 24.0f ); }
            { put("40104", 25.0f ); }
            { put("30104", 26.0f ); }
            { put("70103", 27.0f ); }
            { put("60101", 28.0f ); }
            { put("50308", 29.0f ); }
        };

    }

    @Override
    public float getCityTemperature(String city) {
        var temperature = ofNullable(this.cityTemperatureData.get(city));
        return temperature.orElseThrow();
    }

    @Override
    public float getByZipCodeTemperature(String zipCode) {
        var temperature = ofNullable(this.zipCodeTemperatureData.get(zipCode));
        return temperature.orElseThrow();
    }
}
